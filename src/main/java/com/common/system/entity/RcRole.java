package com.common.system.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class RcRole implements Serializable{
    private static final long serialVersionUID = 6615885049491160726L;
    private Integer id;

    private String name;

    private String value;

    private String tips;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    private Integer status;



}