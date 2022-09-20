package com.forum.admin.controller;

import com.forum.admin.entity.ModuleInfo;
import com.forum.admin.entity.SonModuleInfo;
import com.forum.admin.service.Impl.SonModuleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class SonModuleController {
    @Autowired
    private SonModuleServiceImpl service;
    @RequestMapping(path = "/getAllModule")
    @ResponseBody
    public Map getAllModule(){
        List<ModuleInfo> list=service.getAllModule();
        Map map=new HashMap();
        map.put("status",1);
        map.put("data",list);
        return map;

    }

    @RequestMapping(path = "/findSonByMid")
    @ResponseBody
    public Map findSonByMid(String mid){
        List<SonModuleInfo> list=service.findSonByMid(mid);
        Map map=new HashMap();
        map.put("code",0);
        map.put("msg","");
        map.put("count",list.size());
        map.put("data",list.toArray());
        return map;
    }



    @RequestMapping(path = "/updateSonModulesState")
    @ResponseBody
    public Integer updateModulesState(Integer smid,Integer smstate){
        Integer result=service.updateState(smid, smstate);
        return result;
    }


    @RequestMapping(path = "/addSonModule")
    @ResponseBody
    public Integer addSonModule(String mid,String smname,String smicon){
        Map map=new HashMap();
        map.put("mid",mid);
        map.put("smname",smname);
        map.put("smicon",smicon);
        System.out.println(map);
        return service.addSonModule(map);
    }


    @RequestMapping(path = "/upSonModule")
    @ResponseBody
    public Integer upSonModule(String mid,String smname,String smid,String smicon,String oldMid){
        Map map=new HashMap();
        map.put("smid",smid);
        map.put("mid",mid);
        map.put("smname",smname);
        map.put("smicon",smicon);
        map.put("oldMid",oldMid);
        System.out.println(map);
        return service.upSonModule(map);
    }
}
