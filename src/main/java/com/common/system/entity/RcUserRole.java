package com.common.system.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author yangxiufeng
 * @since 2017-09-11
 */
@TableName("rc_user_role")
@Data
public class RcUserRole extends Model<RcUserRole> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	@TableField("user_id")
	private Integer userId;
	@TableField("role_id")
	private Integer roleId;
	@TableField("create_time")
	private Date createTime;
	@TableField("create_by")
	private String createBy;
	@Override
	protected Serializable pkVal() {
		return this.id;
	}


}
