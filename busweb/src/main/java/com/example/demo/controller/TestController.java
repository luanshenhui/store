package com.example.demo.controller;


import com.example.demo.entity.TestEntity;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demoproject/test")
public class TestController {

    @Autowired
    private TestService testService ;

    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public TestEntity test(@PathVariable String id){
        System.out.println("id:" + id);
        return testService.getById(id);
    }

    @RequestMapping(value = "/gamen/{id}",method = RequestMethod.GET)
    public String gamen(@PathVariable String id){
        System.out.println("id:" + id);
        return "a";
    }

}
