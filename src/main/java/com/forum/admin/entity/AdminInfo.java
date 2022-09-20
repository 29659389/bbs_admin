package com.forum.admin.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
public class AdminInfo {
    @Id
    private Integer uid;
    private String uname;
    private String upwd;
    private String uphone;

    @Override
    public String toString() {
        return "AdminInfo{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", upwd='" + upwd + '\'' +
                ", uphone='" + uphone + '\'' +
                '}';
    }
}
