package com.example.demo.service;

import com.example.demo.dao.TestDao;
import com.example.demo.entity.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private TestDao testDao;

    public TestEntity getById(String id){
        return testDao.getById(id);
    }
}
