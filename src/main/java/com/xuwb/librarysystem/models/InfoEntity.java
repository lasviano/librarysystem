package com.xuwb.librarysystem.models;

import java.util.Date;

public class InfoEntity {
    private String userName;
    private String bookName;
    private Date backtime;

    public Date getBacktime() {
        return backtime;
    }

    public void setBacktime(Date backtime) {
        this.backtime = backtime;
    }

    public InfoEntity(String userName, String bookName, Date backtime) {
        this.userName = userName;
        this.bookName = bookName;
        this.backtime = backtime;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
