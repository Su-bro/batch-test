package com.example.test.dao;

import com.example.test.vo.ResVo;
import com.example.test.vo.TestVO;

import java.util.List;

public interface TestDao {
    List<TestVO> get();
    void insert(ResVo resVo);
}
