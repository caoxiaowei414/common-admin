package com.common.system.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class RcMenu implements Serializable{
    private static final long serialVersionUID = 4419340793159328904L;
    private String id;

    private String code;

    private String pCode;

    private String pId;

    private String name;

    private String url;

    private Integer isMenu;

    private Integer level;

    private Integer sort;

    private Integer status;

    private String icon;
    @JsonIgnore
    private Date createTime;
    @JsonIgnore
    private Date updateTime;

    private List<RcMenu> child;

}