package com.xuwb.librarysystem.controller;

import com.xuwb.librarysystem.models.BorrowInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/info")
public class BorrowInfoController {



    @GetMapping
    public List<BorrowInfo> queryExpiredBooks(){
        return null;
    }
}
