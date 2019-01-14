package com.common.system.entity;

import lombok.Data;

@Data
public class RcDept {
    private Integer id;
    private Integer num;
    private Integer pid;
    private String simpleName;
    private String fullName;
    private String tips;
    private Integer version;


}