package com.forum.admin.service;

import com.forum.admin.entity.UserInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserListService {
    List<UserInfo> getAllUser(String uid,String uphone);
    Integer updateState(Integer uid,Integer state);
    UserInfo findUser(String uid,String uphone);
    Integer updateUser(UserInfo userInfo);

}
