package com.forum.admin.mapper;

import com.forum.admin.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.security.core.userdetails.User;

import java.util.List;

@Mapper
public interface UserListMapper {
    List<UserInfo> getAllUser(String uid,String uphone);
    Integer updateState(Integer uid,Integer state);
    UserInfo findUser(String uid,String uphone);
    Integer updateUser(UserInfo userInfo);
}
