package com.xuwb.librarysystem.models;

import java.util.Date;

public class BorrowInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column borrow_info.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column borrow_info.book_name
     *
     * @mbggenerated
     */
    private String bookName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column borrow_info.user_name
     *
     * @mbggenerated
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column borrow_info.borrow_time
     *
     * @mbggenerated
     */
    private Date borrowTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column borrow_info.plan_backtime
     *
     * @mbggenerated
     */
    private Date planBacktime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column borrow_info.backtime
     *
     * @mbggenerated
     */
    private Date backtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column borrow_info.id
     *
     * @return the value of borrow_info.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column borrow_info.id
     *
     * @param id the value for borrow_info.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column borrow_info.book_name
     *
     * @return the value of borrow_info.book_name
     *
     * @mbggenerated
     */
    public String getBookName() {
        return bookName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column borrow_info.book_name
     *
     * @param bookName the value for borrow_info.book_name
     *
     * @mbggenerated
     */
    public void setBookName(String bookName) {
        this.bookName = bookName == null ? null : bookName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column borrow_info.user_name
     *
     * @return the value of borrow_info.user_name
     *
     * @mbggenerated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column borrow_info.user_name
     *
     * @param userName the value for borrow_info.user_name
     *
     * @mbggenerated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column borrow_info.borrow_time
     *
     * @return the value of borrow_info.borrow_time
     *
     * @mbggenerated
     */
    public Date getBorrowTime() {
        return borrowTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column borrow_info.borrow_time
     *
     * @param borrowTime the value for borrow_info.borrow_time
     *
     * @mbggenerated
     */
    public void setBorrowTime(Date borrowTime) {
        this.borrowTime = borrowTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column borrow_info.plan_backtime
     *
     * @return the value of borrow_info.plan_backtime
     *
     * @mbggenerated
     */
    public Date getPlanBacktime() {
        return planBacktime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column borrow_info.plan_backtime
     *
     * @param planBacktime the value for borrow_info.plan_backtime
     *
     * @mbggenerated
     */
    public void setPlanBacktime(Date planBacktime) {
        this.planBacktime = planBacktime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column borrow_info.backtime
     *
     * @return the value of borrow_info.backtime
     *
     * @mbggenerated
     */
    public Date getBacktime() {
        return backtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column borrow_info.backtime
     *
     * @param backtime the value for borrow_info.backtime
     *
     * @mbggenerated
     */
    public void setBacktime(Date backtime) {
        this.backtime = backtime;
    }
}