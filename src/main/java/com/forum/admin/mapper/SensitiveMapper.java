package com.forum.admin.mapper;

import com.forum.admin.entity.SensitiveInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SensitiveMapper {
    List<SensitiveInfo> findAll(@Param(value="context")String context);
    Integer addSst(String context);
}
