package com.example.test;

import com.example.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TestApplication {

    static TestService testService;

    public static void main(String[] args) {
        ConfigurableApplicationContext task = SpringApplication.run(TestApplication.class, args);
        task.close();
    }

}
