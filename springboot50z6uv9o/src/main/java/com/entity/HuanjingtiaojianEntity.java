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
 * 环境条件
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2025-02-28 14:48:48
 */
@TableName("huanjingtiaojian")
public class HuanjingtiaojianEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HuanjingtiaojianEntity() {
		
	}
	
	public HuanjingtiaojianEntity(T t) {
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
	 * 温度
	 */
					
	private String wendu;
	
	/**
	 * 湿度
	 */
					
	private String shidu;
	
	/**
	 * 氨气浓度
	 */
					
	private String anqinongdu;
	
	
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
	 * 设置：温度
	 */
	public void setWendu(String wendu) {
		this.wendu = wendu;
	}
	/**
	 * 获取：温度
	 */
	public String getWendu() {
		return wendu;
	}
	/**
	 * 设置：湿度
	 */
	public void setShidu(String shidu) {
		this.shidu = shidu;
	}
	/**
	 * 获取：湿度
	 */
	public String getShidu() {
		return shidu;
	}
	/**
	 * 设置：氨气浓度
	 */
	public void setAnqinongdu(String anqinongdu) {
		this.anqinongdu = anqinongdu;
	}
	/**
	 * 获取：氨气浓度
	 */
	public String getAnqinongdu() {
		return anqinongdu;
	}

}
