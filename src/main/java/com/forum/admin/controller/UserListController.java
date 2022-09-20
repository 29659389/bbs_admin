package com.forum.admin.controller;

import com.forum.admin.entity.UserInfo;
import com.forum.admin.service.Impl.UserListServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.soap.MimeHeaders;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserListController {
    @Autowired
    private UserListServiceImpl service;
    @RequestMapping(path = "/getAllUser")
    @ResponseBody
    private Map getAllUser(String uid,String uphone){
        System.out.println(uid+"  "+uphone);
        List<UserInfo> userInfos=service.getAllUser(uid,uphone);
        System.out.println(userInfos);
        Map map=new HashMap();
        map.put("code",0);
        map.put("msg","");
        map.put("count",userInfos.size());
        map.put("data",userInfos.toArray());
        //System.out.println(map);
        return map;
    }

    @RequestMapping(path = "/updateState")
    @ResponseBody
    public Integer updateState(Integer uid,Integer state){
        Integer result= service.updateState(uid, state);
        return result;
    }

    @RequestMapping(path = "/updateUser")
    @ResponseBody
    public Integer updateUser(UserInfo userInfo){
        Integer result= service.updateUser(userInfo);
        return result;
    }

}
