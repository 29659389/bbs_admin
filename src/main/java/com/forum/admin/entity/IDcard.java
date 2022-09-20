package com.forum.admin.entity;

import lombok.Data;

import javax.persistence.Id;

@Data
public class IDcard {
    @Id
    private Integer aid;
    private Integer uid;
    private String uname;
    private String uIDcard;

    @Override
    public String toString() {
        return "IDcard{" +
                "aid=" + aid +
                ", uid=" + uid +
                ", uname='" + uname + '\'' +
                ", uIDcard='" + uIDcard + '\'' +
                '}';
    }
}
