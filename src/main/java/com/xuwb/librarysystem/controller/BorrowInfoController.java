package com.xuwb.librarysystem.controller;

import com.xuwb.librarysystem.models.BorrowInfo;
import com.xuwb.librarysystem.service.BorrowInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/infos")
public class BorrowInfoController {

    @Autowired
    private BorrowInfoService borrowInfoService;

    @GetMapping
    public List<BorrowInfo> queryExpiredBooks(){
        List<BorrowInfo> result = borrowInfoService.query();
        return result;
    }
}
