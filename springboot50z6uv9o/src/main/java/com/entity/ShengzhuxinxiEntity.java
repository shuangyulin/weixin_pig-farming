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
 * 生猪信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2025-02-28 14:48:48
 */
@TableName("shengzhuxinxi")
public class ShengzhuxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShengzhuxinxiEntity() {
		
	}
	
	public ShengzhuxinxiEntity(T t) {
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
	 * 出生日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date chushengriqi;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 体重
	 */
					
	private String tizhong;
	
	/**
	 * 产仔情况
	 */
					
	private String chanziqingkuang;
	
	/**
	 * 检疫证明
	 */
					
	private String jianyizhengming;
	
	/**
	 * 母猪品种
	 */
					
	private String muzhupinzhong;
	
	/**
	 * 猪仔来源
	 */
					
	private String zhuzilaiyuan;
	
	
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
	 * 设置：出生日期
	 */
	public void setChushengriqi(Date chushengriqi) {
		this.chushengriqi = chushengriqi;
	}
	/**
	 * 获取：出生日期
	 */
	public Date getChushengriqi() {
		return chushengriqi;
	}
	/**
	 * 设置：性别
	 */
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
	/**
	 * 设置：体重
	 */
	public void setTizhong(String tizhong) {
		this.tizhong = tizhong;
	}
	/**
	 * 获取：体重
	 */
	public String getTizhong() {
		return tizhong;
	}
	/**
	 * 设置：产仔情况
	 */
	public void setChanziqingkuang(String chanziqingkuang) {
		this.chanziqingkuang = chanziqingkuang;
	}
	/**
	 * 获取：产仔情况
	 */
	public String getChanziqingkuang() {
		return chanziqingkuang;
	}
	/**
	 * 设置：检疫证明
	 */
	public void setJianyizhengming(String jianyizhengming) {
		this.jianyizhengming = jianyizhengming;
	}
	/**
	 * 获取：检疫证明
	 */
	public String getJianyizhengming() {
		return jianyizhengming;
	}
	/**
	 * 设置：母猪品种
	 */
	public void setMuzhupinzhong(String muzhupinzhong) {
		this.muzhupinzhong = muzhupinzhong;
	}
	/**
	 * 获取：母猪品种
	 */
	public String getMuzhupinzhong() {
		return muzhupinzhong;
	}
	/**
	 * 设置：猪仔来源
	 */
	public void setZhuzilaiyuan(String zhuzilaiyuan) {
		this.zhuzilaiyuan = zhuzilaiyuan;
	}
	/**
	 * 获取：猪仔来源
	 */
	public String getZhuzilaiyuan() {
		return zhuzilaiyuan;
	}

}
