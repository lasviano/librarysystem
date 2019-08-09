package com.xuwb.librarysystem.service.impl;

import com.xuwb.librarysystem.mappers.BookMapper;
import com.xuwb.librarysystem.mappers.BorrowInfoMapper;
import com.xuwb.librarysystem.mappers.UserMapper;
import com.xuwb.librarysystem.models.*;
import com.xuwb.librarysystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private BookMapper bookMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private BorrowInfoMapper borrowInfoMapper;

    @Override
    public List<Book> query() {
        //查询book信息
        List<Book> books = bookMapper.selectAll();
        return books;
    }

    @Override
    @Transactional
    public Boolean borrow(String userName, String bookName, int days) {
        //check userName是否存在,bookName是否存在,days是否超过最大借阅时间
        Book book = checkInfo(userName, bookName);
        if (book.getIsLend()==IsLend.YES){
            return false;
        }
        checkDays(days);

        //跟新数据库
        BorrowInfo borrowInfo = getBorrowInfo(userName, bookName, days);
        borrowInfoMapper.insert(borrowInfo);
        book.setIsLend(IsLend.YES);
        bookMapper.updateByPrimaryKey(book);
        return true;
    }

    @Override
    @Transactional
    public Boolean backBook(String userName,String bookName) {
        Book book = checkInfo(userName, bookName);
        InfoEntity infoEntity = new InfoEntity(userName,bookName,new Date());
        borrowInfoMapper.updateByInfoEntity(infoEntity);
        book.setIsLend(IsLend.NO);
        bookMapper.updateByPrimaryKey(book);
        return true;
    }

    private Book checkInfo(String userName, String bookName) {
        User user = userMapper.selectByName(userName);
        if (user==null){
            throw new RuntimeException("此用户无法借阅");
        }
        Book book = bookMapper.selectByName(bookName);
        if (book==null){
            throw new RuntimeException("次书不存在");
        }
        return book;
    }

    private void checkDays(int days) {
        //判断days是否超过最大借阅时间
    }

    private BorrowInfo getBorrowInfo(String userName, String bookName, int days) {
        BorrowInfo borrowInfo = new BorrowInfo();
        borrowInfo.setUserName(userName);
        borrowInfo.setBookName(bookName);
        Date borrowTime = new Date();
        borrowInfo.setBorrowTime(borrowTime);
        Date plan_backtime = new Date(borrowTime.getTime() + days * 24 * 60 * 60 * 1000L);
        borrowInfo.setPlanBacktime(plan_backtime);
        return borrowInfo;
    }
}
