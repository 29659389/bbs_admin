package com.forum.admin.mapper;

import com.forum.admin.entity.AdminInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {
    AdminInfo adminLogin(String uname);
}

