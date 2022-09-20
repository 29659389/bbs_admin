package com.forum.admin.service.Impl;

import com.forum.admin.entity.AdminInfo;
import com.forum.admin.mapper.LoginMapper;
import com.forum.admin.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("loginServiceImpl")
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginMapper mapper;
    @Override
    public AdminInfo adminLogin(String uname) {
        return mapper.adminLogin(uname);
    }
    public static void main(String[] args) {
        int i=0;
        System.out.println(i++);
    }

}
