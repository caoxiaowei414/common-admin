package com.common.system.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by  on 2017/8/2.
 * Time:17:52
 * ProjectName:Common-admin
 */
@Data
public class ZTreeNode implements Serializable{
    private static final long serialVersionUID = -7664784184286632837L;

    private String id;
    private String pId;
    private String name;
    private boolean open = true;//是否打开节点

    private boolean checked;//是否被选中

    private String code;

    private Integer level;


}
