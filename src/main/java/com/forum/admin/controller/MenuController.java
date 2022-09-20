package com.forum.admin.controller;

import com.forum.admin.entity.AdminInfo;
import com.forum.admin.service.Impl.MenuServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;
@Controller
public class MenuController {
    @Autowired
    private MenuServiceImpl service;
    @RequestMapping(path = "/getMenu")
    @ResponseBody
    public List<Map> getMenu(HttpSession session){
        //从session中获取信息
        AdminInfo adminInfo= (AdminInfo) session.getAttribute("userInfo");
        //获取用户uid便于查询权限
        Integer uid=adminInfo.getUid();
        //将查询的权限信息返回到前台页面
        return service.getMenu(uid);
    }

}
