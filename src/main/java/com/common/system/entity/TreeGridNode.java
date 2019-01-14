package com.common.system.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Mr.Yangxiufeng on 2017/9/12.
 * Time:15:46
 * ProjectName:Common-admin
 */
@Data
public class TreeGridNode  implements Serializable{
    private static final long serialVersionUID = 7333189210968942514L;
    /**
     * TreeGrid id 和Parent不能是String,也是蛋疼
     */
    private Long id;

    private String name;

    private String url;

    private Long _parentId;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createDate;

    private String state = "open";

    private String menuId;

    private Integer level;

    private Integer sort;

    private String code;


}
