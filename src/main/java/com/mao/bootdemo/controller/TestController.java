package com.mao.bootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Mingpeidev
 * @date 2021/6/5 10:03
 * @description
 */
@Controller
public class TestController {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello World!";
    }

    @RequestMapping("/test")
    public String test() {
        return "test.html";
    }
}
