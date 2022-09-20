package com.forum.admin.entity;

import lombok.Data;

import javax.persistence.Id;

@Data
public class PostInfo {
    @Id
    private Integer pid;
    private String pname;
    private String pcontent;
    private String ptime;
    private Integer uid;
    private String uname;
    private Integer pstate;

    @Override
    public String toString() {
        return "PostInfo{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", pcontent='" + pcontent + '\'' +
                ", ptime='" + ptime + '\'' +
                ", uid=" + uid +
                ", uname='" + uname + '\'' +
                ", pstate=" + pstate +
                '}';
    }


}
