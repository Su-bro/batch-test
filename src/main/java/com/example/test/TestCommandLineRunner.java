package com.example.test;

import com.example.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestCommandLineRunner implements CommandLineRunner {

    @Autowired
    TestService testService;

    @Override
    public void run(String... args) throws Exception {
        testService.getList();
        System.out.println("1.command line runner");
    }
}
