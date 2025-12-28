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
 * 动物检疫
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2025-02-28 14:48:49
 */
@TableName("dongwujianyi")
public class DongwujianyiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DongwujianyiEntity() {
		
	}
	
	public DongwujianyiEntity(T t) {
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
	 * 生猪编号
	 */
					
	private String shengzhubianhao;
	
	/**
	 * 猪的品种
	 */
					
	private String zhudepinzhong;
	
	/**
	 * 检疫时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date jianyishijian;
	
	/**
	 * 检疫机构
	 */
					
	private String jianyijigou;
	
	/**
	 * 检疫人员
	 */
					
	private String jianyirenyuan;
	
	/**
	 * 检疫结果
	 */
					
	private String jianyijieguo;
	
	
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
	 * 设置：生猪编号
	 */
	public void setShengzhubianhao(String shengzhubianhao) {
		this.shengzhubianhao = shengzhubianhao;
	}
	/**
	 * 获取：生猪编号
	 */
	public String getShengzhubianhao() {
		return shengzhubianhao;
	}
	/**
	 * 设置：猪的品种
	 */
	public void setZhudepinzhong(String zhudepinzhong) {
		this.zhudepinzhong = zhudepinzhong;
	}
	/**
	 * 获取：猪的品种
	 */
	public String getZhudepinzhong() {
		return zhudepinzhong;
	}
	/**
	 * 设置：检疫时间
	 */
	public void setJianyishijian(Date jianyishijian) {
		this.jianyishijian = jianyishijian;
	}
	/**
	 * 获取：检疫时间
	 */
	public Date getJianyishijian() {
		return jianyishijian;
	}
	/**
	 * 设置：检疫机构
	 */
	public void setJianyijigou(String jianyijigou) {
		this.jianyijigou = jianyijigou;
	}
	/**
	 * 获取：检疫机构
	 */
	public String getJianyijigou() {
		return jianyijigou;
	}
	/**
	 * 设置：检疫人员
	 */
	public void setJianyirenyuan(String jianyirenyuan) {
		this.jianyirenyuan = jianyirenyuan;
	}
	/**
	 * 获取：检疫人员
	 */
	public String getJianyirenyuan() {
		return jianyirenyuan;
	}
	/**
	 * 设置：检疫结果
	 */
	public void setJianyijieguo(String jianyijieguo) {
		this.jianyijieguo = jianyijieguo;
	}
	/**
	 * 获取：检疫结果
	 */
	public String getJianyijieguo() {
		return jianyijieguo;
	}

}
