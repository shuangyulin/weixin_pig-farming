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
 * 治污
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2025-02-28 14:48:48
 */
@TableName("zhiwu")
public class ZhiwuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZhiwuEntity() {
		
	}
	
	public ZhiwuEntity(T t) {
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
	 * 设施名称
	 */
					
	private String sheshimingcheng;
	
	/**
	 * 设施容量
	 */
					
	private String sheshirongliang;
	
	/**
	 * 处理能力
	 */
					
	private String chulinengli;
	
	/**
	 * 维护周期
	 */
					
	private String weihuzhouqi;
	
	/**
	 * 处理金额
	 */
					
	private String chulijine;
	
	
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
	 * 设置：设施名称
	 */
	public void setSheshimingcheng(String sheshimingcheng) {
		this.sheshimingcheng = sheshimingcheng;
	}
	/**
	 * 获取：设施名称
	 */
	public String getSheshimingcheng() {
		return sheshimingcheng;
	}
	/**
	 * 设置：设施容量
	 */
	public void setSheshirongliang(String sheshirongliang) {
		this.sheshirongliang = sheshirongliang;
	}
	/**
	 * 获取：设施容量
	 */
	public String getSheshirongliang() {
		return sheshirongliang;
	}
	/**
	 * 设置：处理能力
	 */
	public void setChulinengli(String chulinengli) {
		this.chulinengli = chulinengli;
	}
	/**
	 * 获取：处理能力
	 */
	public String getChulinengli() {
		return chulinengli;
	}
	/**
	 * 设置：维护周期
	 */
	public void setWeihuzhouqi(String weihuzhouqi) {
		this.weihuzhouqi = weihuzhouqi;
	}
	/**
	 * 获取：维护周期
	 */
	public String getWeihuzhouqi() {
		return weihuzhouqi;
	}
	/**
	 * 设置：处理金额
	 */
	public void setChulijine(String chulijine) {
		this.chulijine = chulijine;
	}
	/**
	 * 获取：处理金额
	 */
	public String getChulijine() {
		return chulijine;
	}

}
