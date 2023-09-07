package com.liukai.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author liukai
 * @version 1.0
 * @date 2023/9/3 20:17
 */
@Controller
public class TestViewController {

    @RequestMapping("/test_view")
    public String testView(){

        return "test_view";
    }

    @RequestMapping("/testThymeleafView")
    public String page1(){

        return "success";
    }

    @RequestMapping("/testForward")
    public String testForward(){
        return "forward:/testThymeleafView";
    }

    @RequestMapping("/testRedirect")
    public String testRedirect(){
        return "redirect:/testThymeleafView";
    }
}
