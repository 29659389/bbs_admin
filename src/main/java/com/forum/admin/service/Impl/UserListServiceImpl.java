package com.forum.admin.service.Impl;

import com.forum.admin.entity.UserInfo;
import com.forum.admin.mapper.UserListMapper;
import com.forum.admin.service.UserListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userListServiceImpl")
public class UserListServiceImpl  implements UserListService {
    @Autowired
    private UserListMapper mapper;
    @Override
    public List<UserInfo> getAllUser(String uid,String uphone) {
        return mapper.getAllUser(uid,uphone);
    }

    @Override
    public Integer updateState(Integer uid, Integer state) {
        return mapper.updateState(uid,state);
    }

    @Override
    public UserInfo findUser(String uid, String uphone) {
        return mapper.findUser(uid,uphone);
    }

    @Override
    public Integer updateUser(UserInfo userInfo) {
        return mapper.updateUser(userInfo);
    }
}
