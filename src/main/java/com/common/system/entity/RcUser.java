package com.common.system.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
@TableName("rc_user")
@Data
public class RcUser extends Model<RcUser> implements Serializable{
    private static final long serialVersionUID = -8597875106667295283L;
    @TableId(value="id", type= IdType.AUTO)
    private Integer id;
    @Excel(name = "头像")
    private String avatar;
    @Excel(name = "用户名",width = 30)
    private String username;

    private String password;

    private String salt;
    @Excel(name = "姓名",width = 30)
    private String name;
    @Excel(name = "生日",databaseFormat = "yyyyMMddHHmmss",format = "yyyyMMdd",width = 50)
    private Date birthday;
    @Excel(name = "性别",replace = {"男_1","女_2"})
    private Integer sex;
    @Excel(name = "邮箱")
    private String email;
    @Excel(name = "电话")
    private String phone;

    private Integer status;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField("create_time")
    private Date createTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField("update_time")
    private Date updateTime;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }
    @TableField(exist = false)
    private List<RcRole> roleList;

}