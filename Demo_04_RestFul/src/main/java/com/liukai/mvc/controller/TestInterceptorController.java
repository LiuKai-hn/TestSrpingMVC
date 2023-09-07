package com.liukai.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author：liukai
 * @Date：2023/9/7 10:47
 * 拦截器测试
 */
@Controller
public class TestInterceptorController {

    @RequestMapping("/testInterceptor")
    public String testInterceptor(){

        return "success";
    }
}
