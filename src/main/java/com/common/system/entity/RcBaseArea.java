package com.common.system.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * 
 * </p>
 *
 * @author yangxiufeng
 * @since 2017-09-12
 */
@TableName("rc_base_area")
@Data
public class RcBaseArea extends Model<RcBaseArea> {

    private static final long serialVersionUID = 1L;

	private String code;
	private String name;
	@TableField("parent_code")
	private String parentCode;
	private Integer level;
	@TableField("create_time")
	private Date createTime;
	@TableField("update_time")
	private Date updateTime;
	@TableField(exist=false)
	private List<RcBaseArea> children;
	@Override
	protected Serializable pkVal() {
		return this.code;
	}

}
