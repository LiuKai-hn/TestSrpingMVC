package com.liukai.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author：liukai
 * @Date：2023/8/31 16:25
 */
@Controller
@RequestMapping("/test")
public class RequestMappingController {

    //此时请求映射所映射的请求的请求路径为：/test/testRequestMapping
    @RequestMapping(
            value = {"/testRequestMapping","/test"}
    )
    public String testRequestMapping(){
        return "success";
    }

    //@RequestMapping(value = "/testForm",method = RequestMethod.POST)
    @PostMapping("/testForm")
    public String testRequestMappingForm(){
        return "success";
    }

    @RequestMapping(value = "/testParamsAndHeaders",
    params = {"username"},
            headers = {"Host=localhost:8081"} // host 必须是 8081 ,否则访问不了
    )
    public String testParamsAndHeaders(){
        return "success";
    }

    /**
     * 测试 ant 风格
     * @return
     */
    //@RequestMapping(value = "/a?a/testAnt")
    //@RequestMapping(value = "/a*a/testAnt")
    @RequestMapping(value = "/**/testAnt")
    public String testAnt(){
        return "success";
    }
    @RequestMapping(value = "/testPath/{id}/{username}")
    public String testPath(@PathVariable("id")Integer id,@PathVariable("username")String username){
        System.out.println("id = " + id);
        System.out.println("username = " + username);
        return "success";
    }

}
