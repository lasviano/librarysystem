package com.xuwb.librarysystem.service.impl;

import com.xuwb.librarysystem.mappers.BorrowInfoMapper;
import com.xuwb.librarysystem.models.BorrowInfo;
import com.xuwb.librarysystem.service.BorrowInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class BorrowInfoServiceImpl implements BorrowInfoService {

    @Autowired
    private BorrowInfoMapper borrowInfoMapper;

    @Override
    public List<BorrowInfo> query() {
        //如果backtime为空，判断当前时间是否大于plan_backtime
        List<BorrowInfo> borrowInfos = borrowInfoMapper.selectByBacktime();
        List<BorrowInfo> expiredBooks = new ArrayList<>();
        for (BorrowInfo borrowInfo:borrowInfos){
            Date planBacktime = borrowInfo.getPlanBacktime();
            if (planBacktime.before(new Date())){
                expiredBooks.add(borrowInfo);
            }
        }
        return expiredBooks;
    }
}
