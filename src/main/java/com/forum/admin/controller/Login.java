package com.forum.admin.controller;


import com.forum.admin.entity.AdminInfo;
import com.forum.admin.service.Impl.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.security.Principal;

@Controller
public class Login {
    @Autowired
    private LoginServiceImpl service;

    //登陆成功后跳转到的页面
    @RequestMapping(path = "/homepage")
    public String homepage(HttpServletRequest request){
        //获取登陆名，查询其相对应的数据，将其放到session中
        Principal principal = request.getUserPrincipal();
        String uphone=principal.getName();
        AdminInfo adminInfo=  service.adminLogin(uphone);
        //System.out.println(adminInfo);
        //将获取到的内容放到session中
        HttpSession session=request.getSession();
        session.setAttribute("userInfo",adminInfo);
        //System.out.println(session.getAttribute("userInfo"));
        return "homepage";
    }

    //设置登陆失败跳转地址
    @RequestMapping(path = "/loginError")
    public String loginError(Model model){
        //通过model获取错误信息，将信息传到前段页面
        model.addAttribute("meg","账号或密码错误，请重试");
        return "login";
    }



}
