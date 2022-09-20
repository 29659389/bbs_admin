package com.forum.admin.entity;

import lombok.Data;

import javax.persistence.Id;

@Data
public class ReplyPost {
    @Id
    private Integer rid;
    private Integer uid;
    private String  rcontent;
    private Integer pid;
    private String pname;
    private String uname;
    private String ptime;
    private Integer rstate;

    @Override
    public String toString() {
        return "ReplyPost{" +
                "rid=" + rid +
                ", uid=" + uid +
                ", rcontent='" + rcontent + '\'' +
                ", pid=" + pid +
                ", pname='" + pname + '\'' +
                ", uname='" + uname + '\'' +
                ", ptime='" + ptime + '\'' +
                ", rstate=" + rstate +
                '}';
    }
}
