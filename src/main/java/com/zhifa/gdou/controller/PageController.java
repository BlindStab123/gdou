package com.zhifa.gdou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/manager")
public class PageController {

    /**
     * 跳转到登录页面
     * @return
     */
    @RequestMapping("/login")
    public String toManager_login(){
        return "manager_login";
    }

    /**
     * 退出登录，清除session
     * @param httpSession
     * @return
     */
    @RequestMapping("/logout")
    public String manager_out(HttpSession httpSession){
        httpSession.setAttribute("manager",null);
        return "manager_login";
    }


    /**
     * 跳转到管理员后台主页面
     * @return
     */
    @RequestMapping("/manager_main_page")
    public String toManager_main_page(){
        return "manager_index";
    }

    /**
     * 加载欢迎页面
     * @return
     */
    @RequestMapping("/welcomePage")
    public String toWelcomePage(){
        return "welcome";
    }


    @RequestMapping("/teacherInfo")
    public String toTeacherInfo(){
        return "teacherInfo";
    }



    @RequestMapping("/class_info")
    public String toClass_info(){
        return "class_info";
    }


    @RequestMapping("/student_info")
    public String tostudent_info(){
        return "student_info";
    }


  @RequestMapping("/wx_more_info")
    public String towx_more_info(){
        return "wx_more_info";
    }




}
