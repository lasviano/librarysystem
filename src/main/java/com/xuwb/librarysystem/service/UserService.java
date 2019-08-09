package com.xuwb.librarysystem.service;

import com.xuwb.librarysystem.models.Book;

import java.util.List;

public interface UserService {
    List<Book> query();

    Boolean borrow(String userName, String bookName, int days);

    Boolean backBook(String userName,String bookName);
}
