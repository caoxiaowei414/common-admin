package com.common.system.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Created by  on 2017/9/12.
 * Time:18:00
 * ProjectName:Common-admin
 */
@Data
public class TreeGridWrapper implements Serializable {
    private static final long serialVersionUID = 3871928415548297855L;
    private Integer total;
    private List<TreeGridNode> rows;


}
