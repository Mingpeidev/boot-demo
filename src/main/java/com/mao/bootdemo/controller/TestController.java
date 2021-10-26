package com.mao.bootdemo.controller;

import com.mao.bootdemo.StudentProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author Mingpeidev
 * @date 2021/6/5 10:03
 * @description
 */
@Controller
public class TestController {

    @Value("${student.name}")
    private String name;
    @Value("${student.age}")
    private String age;
    @Value("${student.content}")
    private String content;

    @Resource
    private StudentProperties studentProperties;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "第一种方式：" + content + "-----第二种方式：" + studentProperties.getContent();
    }

    @RequestMapping("/test")
    public String test() {
        return "test.html";
    }
}
