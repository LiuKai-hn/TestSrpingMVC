package com.liukai.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author liukai
 * @version 1.0
 * @date 2023/9/3 17:56
 */
@Controller
public class TestServletAPI {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/testRequestServletAPI")
    public String page1(HttpServletRequest request){

        request.setAttribute("testScope", "hello,servletAPI");
        return "success";
    }

    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(){
        /**
         * ModelAndView有Model和View的功能
         * Model主要用于向请求域共享数据
         * View主要用于设置视图，实现页面跳转
         */
        ModelAndView mav = new ModelAndView();
        //向请求域共享数据
        mav.addObject("testModelAndViewScope", "hello,ModelAndView");
        //设置视图，实现页面跳转
        mav.setViewName("success");
        System.out.println("ModelAndView===> " + mav.getClass().getName());
        return mav;
    }

    @RequestMapping("/testModel")
    public String testModel(Model model){
        model.addAttribute("testModelScope", "hello,Model");
        return "success";
    }

    @RequestMapping("/testMap")
    public String testMap(Map<String, Object> map){
        map.put("testMapScope", "hello,Map");
        System.out.println("map===> " + map.getClass().getName());
        return "success";
    }

    @RequestMapping("/testModelMap")
    public String testModelMap(ModelMap modelMap){
        modelMap.addAttribute("testModelMapScope", "hello,ModelMap");
        System.out.println("modelMap===> " + modelMap.getClass().getName());
        return "success";
    }

    @RequestMapping("/testSession")
    public String testSession(HttpSession session){
        session.setAttribute("testSessionScope", "hello,session");
        return "success";
    }

    @RequestMapping("/testApplication")
    public String testApplication(HttpSession session){
        ServletContext application = session.getServletContext();
        application.setAttribute("testApplicationScope", "hello,application");
        return "success";
    }

}
