package com.forum.admin.service;

import com.forum.admin.entity.ModuleInfo;
import com.forum.admin.entity.SonModuleInfo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface SonModuleService {
    List<ModuleInfo> getAllModule();
    List<SonModuleInfo> findSonByMid(String mid);
    Integer updateState(Integer smid,Integer smstate);
    //添加子模块
    Integer addSonModule(Map map);
    //获取添加帖子后的主键ID
    Integer getIdentity();
    //将子模块与主模块绑定
    Integer addSon_Module(String mid,String smid);

    //修改子版块信息
    Integer upSonModule(Map map);

    //修改子版块对应的主版块
    Integer upModule_SonModule(String mid,String smid,String oldMid);
}
