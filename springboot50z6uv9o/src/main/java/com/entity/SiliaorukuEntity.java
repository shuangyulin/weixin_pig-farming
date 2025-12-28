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
 * 饲料入库
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2025-02-28 14:48:49
 */
@TableName("siliaoruku")
public class SiliaorukuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public SiliaorukuEntity() {
		
	}
	
	public SiliaorukuEntity(T t) {
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
	 * 入库编号
	 */
					
	private String rukubianhao;
	
	/**
	 * 饲料编号
	 */
					
	private String siliaobianhao;
	
	/**
	 * 饲料名称
	 */
					
	private String siliaomingcheng;
	
	/**
	 * 饲料规格
	 */
					
	private String siliaoguige;
	
	/**
	 * 饲料价格
	 */
					
	private Double siliaojiage;
	
	/**
	 * 数量
	 */
					
	private Integer shuliang;
	
	/**
	 * 供应商
	 */
					
	private String gongyingshang;
	
	/**
	 * 采购合同
	 */
					
	private String caigouhetong;
	
	/**
	 * 采购时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date caigoushijian;
	
	
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
	 * 设置：入库编号
	 */
	public void setRukubianhao(String rukubianhao) {
		this.rukubianhao = rukubianhao;
	}
	/**
	 * 获取：入库编号
	 */
	public String getRukubianhao() {
		return rukubianhao;
	}
	/**
	 * 设置：饲料编号
	 */
	public void setSiliaobianhao(String siliaobianhao) {
		this.siliaobianhao = siliaobianhao;
	}
	/**
	 * 获取：饲料编号
	 */
	public String getSiliaobianhao() {
		return siliaobianhao;
	}
	/**
	 * 设置：饲料名称
	 */
	public void setSiliaomingcheng(String siliaomingcheng) {
		this.siliaomingcheng = siliaomingcheng;
	}
	/**
	 * 获取：饲料名称
	 */
	public String getSiliaomingcheng() {
		return siliaomingcheng;
	}
	/**
	 * 设置：饲料规格
	 */
	public void setSiliaoguige(String siliaoguige) {
		this.siliaoguige = siliaoguige;
	}
	/**
	 * 获取：饲料规格
	 */
	public String getSiliaoguige() {
		return siliaoguige;
	}
	/**
	 * 设置：饲料价格
	 */
	public void setSiliaojiage(Double siliaojiage) {
		this.siliaojiage = siliaojiage;
	}
	/**
	 * 获取：饲料价格
	 */
	public Double getSiliaojiage() {
		return siliaojiage;
	}
	/**
	 * 设置：数量
	 */
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
	/**
	 * 设置：供应商
	 */
	public void setGongyingshang(String gongyingshang) {
		this.gongyingshang = gongyingshang;
	}
	/**
	 * 获取：供应商
	 */
	public String getGongyingshang() {
		return gongyingshang;
	}
	/**
	 * 设置：采购合同
	 */
	public void setCaigouhetong(String caigouhetong) {
		this.caigouhetong = caigouhetong;
	}
	/**
	 * 获取：采购合同
	 */
	public String getCaigouhetong() {
		return caigouhetong;
	}
	/**
	 * 设置：采购时间
	 */
	public void setCaigoushijian(Date caigoushijian) {
		this.caigoushijian = caigoushijian;
	}
	/**
	 * 获取：采购时间
	 */
	public Date getCaigoushijian() {
		return caigoushijian;
	}

}
