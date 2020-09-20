package com.example.demo.dao;

import com.example.demo.entity.TestEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface TestDao {

    TestEntity getById(String id);

}
