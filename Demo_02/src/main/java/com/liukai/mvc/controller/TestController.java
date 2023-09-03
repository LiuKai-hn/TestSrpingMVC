package com.liukai.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author：liukai
 * @Date：2023/8/31 16:11
 */
@Controller
public class TestController {

    @RequestMapping("/index")
    public String page1(){

        return "index";
    }



}
