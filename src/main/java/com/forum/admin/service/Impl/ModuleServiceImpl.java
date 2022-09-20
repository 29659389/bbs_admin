package com.forum.admin.service.Impl;

import com.forum.admin.entity.ModuleInfo;
import com.forum.admin.mapper.ModuleMapper;
import com.forum.admin.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("moduleServiceImpl")
public class ModuleServiceImpl implements ModuleService {
    @Autowired
    private ModuleMapper mapper;
    @Override
    public List<ModuleInfo> findAllModules(String mid,String mname) {
        return mapper.findAllModules(mid, mname);
    }

    @Override
    public Integer updateState(Integer mid, Integer mstate) {
        return mapper.updateState(mid, mstate);
    }

    @Override
    public Integer addModules(String mname, String micon) {
        return mapper.addModules(mname, micon);
    }

    @Override
    public Integer upModules(String mid, String mname) {
        /*System.out.println(1);
        System.out.println(mid+" "+mname);*/
        return mapper.upModules(mid, mname);
    }
}
