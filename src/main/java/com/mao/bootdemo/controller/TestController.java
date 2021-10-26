package com.mao.bootdemo.controller;

import com.mao.bootdemo.StudentProperties;
import com.mao.bootdemo.dao.UserMapper;
import com.mao.bootdemo.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;

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

    @Resource
    private UserMapper userMapper;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "第一种方式：" + content + "-----第二种方式：" + studentProperties.getContent();
    }

    @RequestMapping("/test")
    public String test(Model model) {
        model.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
        return "test";
    }

    @RequestMapping("/user")
    @ResponseBody
    public List<User> getUser() {
        return userMapper.findAll();
    }
}
