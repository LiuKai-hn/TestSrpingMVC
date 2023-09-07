package com.liukai.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author：liukai
 * @Date：2023/9/7 14:41
 */
@Controller
public class TestErrorController {

    @RequestMapping("/testExceptionHandler")
    public String testExceptionHandler(){

        System.out.println(1/0);
        return "success";
    }


}
