package com.forum.admin.service.Impl;

import com.forum.admin.mapper.MenuMapper;
import com.forum.admin.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("menuServiceImpl")
public class MenuServiceImpl  implements MenuService {
    @Autowired
    private MenuMapper mapper;
    @Override
    public List<Map> getMenu(Integer uid) {
        return mapper.getMenu(uid);
    }
}
