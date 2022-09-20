package com.forum.admin.service.Impl;

import com.forum.admin.entity.ModuleInfo;
import com.forum.admin.entity.SonModuleInfo;
import com.forum.admin.mapper.SonModuleMapper;
import com.forum.admin.service.SonModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("sonModuleServiceImpl")
public class SonModuleServiceImpl  implements SonModuleService {
    @Autowired
    private SonModuleMapper mapper;
    @Override
    public List<ModuleInfo> getAllModule() {
        return mapper.getAllModule();
    }

    @Override
    public List<SonModuleInfo> findSonByMid(String mid) {
        return mapper.findSonByMid(mid);
    }

    @Override
    public Integer updateState(Integer smid, Integer smstate) {
        return mapper.updateState(smid,smstate);
    }

    @Override
    public Integer addSonModule(Map map) {
        System.out.println(map);
        String mid =map.get("mid").toString();
        Integer result=0;
        result=mapper.addSonModule(map);
        System.out.println(result);
        String smid=getIdentity().toString();
        System.out.println("smid"+smid);
        result=addSon_Module(mid,smid);
        return result;
    }

    @Override
    public Integer getIdentity() {
        return mapper.getIdentity();
    }

    @Override
    public Integer addSon_Module(String mid, String smid) {
        return mapper.addSon_Module(mid, smid);
    }

    @Override
    public Integer upSonModule(Map map) {

        String mid=map.get("mid").toString();
        String smid=map.get("smid").toString();
        String oldSmid=map.get("oldMid").toString();
        Integer result= upModule_SonModule(mid,smid,oldSmid);
        result= mapper.upSonModule(map);
        return result;
    }

    @Override
    public Integer upModule_SonModule(String mid, String smid, String oldMid) {
        return mapper.upModule_SonModule(mid, smid, oldMid);
    }
}
