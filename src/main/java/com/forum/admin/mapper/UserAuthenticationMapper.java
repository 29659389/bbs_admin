package com.forum.admin.mapper;

import com.forum.admin.entity.IDcard;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface UserAuthenticationMapper {
    List<IDcard> findAll(String  uid,String uIDcard,String uname);
}
