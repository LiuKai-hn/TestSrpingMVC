package com.liukai.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author：liukai
 * @Date：2023/9/7 9:16
 */
@Controller
public class TestAJAXController {

    @RequestMapping("/testAxios")
    @ResponseBody
    public String testAxios(String username,String password){

        System.out.println("username = " + username + ", password = " + password);
        return "hello,axios";
    }
}
