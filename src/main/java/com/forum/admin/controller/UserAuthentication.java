package com.forum.admin.controller;

import com.forum.admin.entity.IDcard;
import com.forum.admin.service.Impl.UserAuthenticationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserAuthentication {
    @Autowired
    private UserAuthenticationServiceImpl service;
    @RequestMapping(path = "/getAuthenticationInfo")
    @ResponseBody
    public Map findAll(String uid,String uIDcard,String uname){
        //System.out.println(uid+"  "+uIDcard);
        List<IDcard> list=service.findAll(uid,uIDcard,uname);
        Map map=new HashMap();
        map.put("code",0);
        map.put("msg","");
        map.put("count",list.size());
        map.put("data",list.toArray());
        //System.out.println(map);
        return map;
    }
}
