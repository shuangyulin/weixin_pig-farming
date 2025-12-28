package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 猪舍面积
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2025-02-28 14:48:48
 */
@TableName("zhushemianji")
public class ZhushemianjiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZhushemianjiEntity() {
		
	}
	
	public ZhushemianjiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
    @TableId(type = IdType.AUTO)
	private Long id;
	/**
	 * 猪舍编号
	 */
					
	private String zhushebianhao;
	
	/**
	 * 猪舍区域
	 */
					
	private String zhushequyu;
	
	/**
	 * 总面积
	 */
					
	private String zongmianji;
	
	/**
	 * 存栏头数
	 */
					
	private Integer cunlantoushu;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：猪舍编号
	 */
	public void setZhushebianhao(String zhushebianhao) {
		this.zhushebianhao = zhushebianhao;
	}
	/**
	 * 获取：猪舍编号
	 */
	public String getZhushebianhao() {
		return zhushebianhao;
	}
	/**
	 * 设置：猪舍区域
	 */
	public void setZhushequyu(String zhushequyu) {
		this.zhushequyu = zhushequyu;
	}
	/**
	 * 获取：猪舍区域
	 */
	public String getZhushequyu() {
		return zhushequyu;
	}
	/**
	 * 设置：总面积
	 */
	public void setZongmianji(String zongmianji) {
		this.zongmianji = zongmianji;
	}
	/**
	 * 获取：总面积
	 */
	public String getZongmianji() {
		return zongmianji;
	}
	/**
	 * 设置：存栏头数
	 */
	public void setCunlantoushu(Integer cunlantoushu) {
		this.cunlantoushu = cunlantoushu;
	}
	/**
	 * 获取：存栏头数
	 */
	public Integer getCunlantoushu() {
		return cunlantoushu;
	}

}
