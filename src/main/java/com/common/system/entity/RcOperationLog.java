package com.common.system.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author yangxiufeng
 * @since 2017-09-14
 */
@TableName("rc_operation_log")
@Data
public class RcOperationLog extends Model<RcOperationLog> {

    private static final long serialVersionUID = 1L;

	private String id;
    /**
     * 操作人ID
     */
	@TableField("user_id")
	private Integer userId;
    /**
     * 操作人姓名
     */
	private String username;
    /**
     * 被操作类
     */
	@TableField("class_name")
	private String className;
    /**
     * 方法
     */
	private String method;
    /**
     * 参数
     */
	private String args;
    /**
     * 原始数据
     */
	@TableField("origin_data")
	private String originData;
    /**
     * 新数据
     */
	@TableField("new_data")
	private String newData;
	@TableField("create_time")
	private Date createTime;



	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
