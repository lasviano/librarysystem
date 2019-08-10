package com.xuwb.librarysystem.controller;

import com.xuwb.librarysystem.models.Book;
import com.xuwb.librarysystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<Book> queryBooks(){
        List<Book> books = userService.query();
        return books;
    }

    @PostMapping("/borrow")
    public String borrowBook(@RequestParam("userName") String userName,
                             @RequestParam("bookName") String bookName,
                             @RequestParam("borrowDays") Integer days){
        Boolean result = userService.borrow(userName, bookName, days);
        return result?"borrow success":"borrow fail,this book has been borrowed";
    }

    @PostMapping("/back")
    public String returnBook(@RequestParam("userName") String userName,
                             @RequestParam("bookName") String bookName){
        Boolean reseult = userService.backBook(userName, bookName);
        return reseult?"return success":"return fail";
    }
}
