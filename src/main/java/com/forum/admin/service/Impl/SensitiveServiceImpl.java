package com.forum.admin.service.Impl;

import com.forum.admin.entity.SensitiveInfo;
import com.forum.admin.mapper.SensitiveMapper;
import com.forum.admin.service.SensitiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("sensitiveServiceImpl")
public class SensitiveServiceImpl implements SensitiveService {
    @Autowired
    private SensitiveMapper mapper;
    @Override
    public List<SensitiveInfo> findAll(String context) {
        //System.out.println(1);
        return mapper.findAll(context);
    }

    @Override
    public Integer addSst(String context) {
        return mapper.addSst(context);
    }
}
