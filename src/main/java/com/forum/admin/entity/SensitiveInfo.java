package com.forum.admin.entity;

import lombok.Data;

import javax.persistence.Id;

@Data
public class SensitiveInfo {
    @Id
    private Integer id;
    private String context;

    @Override
    public String toString() {
        return "SensitiveInfo{" +
                "id=" + id +
                ", context='" + context + '\'' +
                '}';
    }
}
