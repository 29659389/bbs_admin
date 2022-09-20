package com.forum.admin.entity;

import lombok.Data;

import javax.persistence.Id;

@Data
public class UserInfo {
    @Id
    private Integer uid;
    private String uname;
    private String upwd;
    private String uphone;
    private String address;
    private String email;
    private String uicon;
    private String gname;
    private Integer state;
    private Integer realstate;

    @Override
    public String toString() {
        return "UserInfo{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", upwd='" + upwd + '\'' +
                ", uphone='" + uphone + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", uicon='" + uicon + '\'' +
                ", gname='" + gname + '\'' +
                ", state=" + state +
                ", realstate=" + realstate +
                '}';
    }
}
