package com.liukai.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author：liukai
 * @Date：2023/9/6 9:29
 */
@Controller
public class UserController {


    /**
     * 使用RESTFUL 模拟用户资源的增删改查
     * /user      GET   查询所有用户信息
     * /user/1    GET   根据id 查询指定用户
     * /user      POST   添加用户信息
     * /user/1    DELETE   删除指定用户信息
     * /user      PUT   修改用户信息
     */

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String getAllUser(){
        System.out.println("查询所有用户");
        return "success";
    }

    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public String getUserById(){
        System.out.println("根据id 查询指定用户");
        return "success";
    }

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public String InsertUser(String username,String password){
        System.out.println("添加用户 ===> username:"+username+",password:"+password);
        return "success";
    }

    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public String UpdateUser(String username,String password){
        System.out.println("修改用户 ===> username:"+username+",password:"+password);
        return "success";
    }
}
