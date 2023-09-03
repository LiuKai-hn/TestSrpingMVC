package com.liukai.mvc.controller;

import com.liukai.mvc.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author：liukai
 * @Date：2023/9/1 16:05
 */
@Controller
public class ParamController {


    @RequestMapping("/param")
    public String param_page(){

        return "testParam";
    }

    @RequestMapping("/testServletAPI")
    public String testServletAPI(HttpServletRequest request){

        String username = request.getParameter("username");

        System.out.println("username = " + username);

        String password = request.getParameter("password");

        System.out.println("password = " + password);

        return "success";
    }


    @RequestMapping("/testparam")
    /**
     * 请求的参数名必须和 方法的形参名保持一致，如果存在某个不一致：
     * eg ：请求中username 而方法名中为user_name 那么user_name 则获取不到user_name传递过来的值，则只能为Null
     */
    public String testparam(String username, String password, String hobby){

        System.out.println("username = " + username);
        System.out.println("password = " + password);
        System.out.println("hobby = " + hobby);

        return "success";
    }

    @RequestMapping("/testparam2")
    /**
     * 请求的参数名必须和 方法的形参名保持一致，如果存在某个不一致：
     * eg ：请求中username 而方法名中为user_name 那么user_name 则获取不到user_name传递过来的值，则只能为Null
     */
    public String testparam2(@RequestParam(value = "user_name",required = false,defaultValue = "lk") String username,
                             String password,
                             String hobby){

        System.out.println("username = " + username);
        System.out.println("password = " + password);
        System.out.println("hobby = " + hobby);

        return "success";
    }

    @RequestMapping("/testpojo")
    public String testpojo(User user){

        System.out.println(user);
        return "success";
    }

}
