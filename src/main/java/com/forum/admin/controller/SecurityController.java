package com.forum.admin.controller;

import com.forum.admin.entity.SensitiveInfo;
import com.forum.admin.service.Impl.SensitiveServiceImpl;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class SecurityController {
    @Autowired
    private SensitiveServiceImpl service;
    @RequestMapping(path = "/getAllSecurity")
    @ResponseBody
    public Map getAllSecurity(String context){
        System.out.println(context);
        List<SensitiveInfo> sensitiveInfos= service.findAll(context);
        Map map=new HashMap();
        map.put("code",0);
        map.put("msg","");
        map.put("count",sensitiveInfos.size());
        map.put("data",sensitiveInfos.toArray());
        return map;
    }
}
