package com.forum.admin.service;

import com.forum.admin.entity.AdminInfo;
import org.springframework.stereotype.Service;

@Service
public interface LoginService {
    AdminInfo adminLogin(String uname);
}
