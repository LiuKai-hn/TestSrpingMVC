package com.liukai.mvc.controller;

import com.liukai.mvc.pojo.Emp;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author：liukai
 * @Date：2023/9/6 14:16
 */
@Controller
public class HttpController {

    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String requestBody){
        System.out.println("requestBody = " + requestBody);
        return "success";
    }

    @RequestMapping("/testRequestEntity")
    public String testRequestEntity(RequestEntity<String> requestEntity){
        System.out.println("requestHeader:"+requestEntity.getHeaders());
        System.out.println("requestBody:"+requestEntity.getBody());
        return "success";
    }

    /**
     * 注意 这里的success 不是跳转到 success 视图 而是 服务端写的响应体
     * @return
     */
    @RequestMapping("/testResponseBody")
    @ResponseBody
    public String testResponseBody(){
        return "hello,liukai";
    }

    @RequestMapping("/testResponseUser")
    @ResponseBody
    public Emp testResponseUser(){
        return new Emp("liukai","123456");
    }
}
