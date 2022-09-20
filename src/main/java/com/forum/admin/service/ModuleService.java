package com.forum.admin.service;

import com.forum.admin.entity.ModuleInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ModuleService {
    //查询所有主版块信息
    List<ModuleInfo> findAllModules(String mid,String mname);
    //修改版块状态
    Integer updateState(Integer mid,Integer mstate);
    //添加主版块
    Integer addModules(String mname,String micon);
    //修改版块信息
    Integer upModules(String mid,String mname);
}
