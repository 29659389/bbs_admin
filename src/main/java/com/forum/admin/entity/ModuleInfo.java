package com.forum.admin.entity;

import lombok.Data;

import javax.persistence.Id;

@Data
public class ModuleInfo {
    @Id
    private Integer mid;
    private String mname;
    private Integer mstate;
    //private String micon;

    @Override
    public String toString() {
        return "ModuleInfo{" +
                "mid=" + mid +
                ", mname='" + mname + '\'' +
                ", mstate=" + mstate +
                '}';
    }


}
