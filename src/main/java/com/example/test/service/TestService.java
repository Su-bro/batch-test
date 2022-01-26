package com.example.test.service;

import com.example.test.dao.TestDao;
import com.example.test.vo.ResVo;
import com.example.test.vo.TestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
@Service
public class TestService {

    @Autowired
    private TestDao testDao;

    public void getList(){
        List<TestVO> list = testDao.get();
        int sum = 0;
        int avg = 0;
        for(TestVO t : list){
            sum+=t.getPrice();
        }
        avg = sum/list.size();
        ResVo res = new ResVo();
        res.setSum(sum);
        res.setAvg(avg);
        res.setDate(LocalDateTime.now());
        testDao.insert(res);
    }

}
