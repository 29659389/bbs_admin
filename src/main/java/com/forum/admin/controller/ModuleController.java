package com.forum.admin.controller;

import com.forum.admin.entity.ModuleInfo;
import com.forum.admin.service.Impl.ModuleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ModuleController {
    @Autowired
    private ModuleServiceImpl service;


    //查询所有主版块
    @RequestMapping(path = "/findAllModules")
    @ResponseBody
    public Map findALLModules(String mid,String mname){
        List<ModuleInfo> modules=service.findAllModules(mid, mname);
        //System.out.println(mid+" "+mname);
        Map map=new HashMap();
        map.put("code",0);
        map.put("msg","");
        map.put("count",modules.size());
        map.put("data",modules.toArray());
        return map;
    }

    //修改主版块状态
    @RequestMapping(path = "/updateModulesState")
    @ResponseBody
    public Integer updateModulesState(Integer mid,Integer mstate){
        System.out.println(mid+" "+mstate);
        Integer result=service.updateState(mid, mstate);
        return result;
    }



    //添加主版块
    @RequestMapping(path = "/addModules")
    @ResponseBody
    public  Integer addModules(String mname,String micon){
        Integer result=service.addModules(mname, micon);
        return result;
    }


    @RequestMapping(path = "/upModules")
    @ResponseBody
    public Integer upModules(String mname,String mid){
       /* System.out.println(mid+" "+mname);*/
        return service.upModules(mid,mname);
    }
}
