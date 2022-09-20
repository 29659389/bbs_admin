package com.forum.admin.service.Impl;

import com.forum.admin.entity.IDcard;
import com.forum.admin.mapper.UserAuthenticationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("userAuthenticationServiceImpl")
public class UserAuthenticationServiceImpl implements UserAuthenticationMapper {
    @Autowired
    private UserAuthenticationMapper mapper;

    @Override
    public List<IDcard> findAll(String uid ,String uIDcard,String uname) {
        return mapper.findAll(uid,uIDcard,uname);
    }
}
