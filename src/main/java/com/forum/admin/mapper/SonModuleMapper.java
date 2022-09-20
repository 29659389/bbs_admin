package com.forum.admin.mapper;

import com.forum.admin.entity.ModuleInfo;
import com.forum.admin.entity.SonModuleInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface SonModuleMapper {
     List<ModuleInfo> getAllModule();
     List<SonModuleInfo> findSonByMid(String mid);
     //修改子模块状态
     Integer updateState(Integer smid,Integer smstate);

     //添加子模块
     Integer addSonModule(Map map);
     //获取添加子模块后的主键ID
     Integer getIdentity();
     //将子模块与主模块绑定
     Integer addSon_Module(String mid,String smid);

     //修改子版块信息
     Integer upSonModule(Map map);

     //修改子版块对应的主版块
     Integer upModule_SonModule(String mid,String smid,String oldMid);
}
