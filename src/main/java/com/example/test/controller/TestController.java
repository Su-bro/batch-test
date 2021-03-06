package com.example.test.controller;


import com.example.test.service.TestService;
import com.example.test.vo.ResVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    TestService testService;
    @GetMapping("/get")
    public void get() {testService.getList();}
}
