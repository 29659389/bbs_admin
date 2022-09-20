package com.forum.admin.service;

import com.forum.admin.entity.SensitiveInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SensitiveService {
    List<SensitiveInfo> findAll(String context);
    Integer addSst(String context);
}
