package com.forum.admin.service;

import com.forum.admin.entity.IDcard;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserAuthenticationService {
    List<IDcard> findAll(String uid,String  uIDcard,String uname);
}
