package com.example.test.vo;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ResVo {
    private int avg;
    private int sum;
    private LocalDateTime date;
}
