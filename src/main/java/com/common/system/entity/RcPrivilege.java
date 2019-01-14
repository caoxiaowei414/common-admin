package com.common.system.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class RcPrivilege implements Serializable{
    private static final long serialVersionUID = -7117576879637960180L;
    private Integer roleId;

    private String menuId;

    private Date createTime;


}