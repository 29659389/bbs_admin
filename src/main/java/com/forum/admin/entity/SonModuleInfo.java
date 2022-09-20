package com.forum.admin.entity;

import lombok.Data;

import javax.persistence.Id;

@Data
public class SonModuleInfo {
    @Id
    private Integer smid;
    private String smname;
    private String smstate;
    private String smicon;

    @Override
    public String toString() {
        return "SonModuleInfo{" +
                "smid=" + smid +
                ", smname='" + smname + '\'' +
                ", smstate='" + smstate + '\'' +
                ", smicon='" + smicon + '\'' +
                '}';
    }
}
