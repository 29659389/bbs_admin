package com.forum.admin.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface MenuService {
    List<Map> getMenu(Integer uid);
}
