package com.entity.vo;

import com.entity.JibingdengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 疾病登记
 * @author 
 * @email 
 * @date 2025-02-28 14:48:48
 */
public class JibingdengjiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 登记时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjishijian;
		
	/**
	 * 疾病名称
	 */
	
	private String jibingmingcheng;
		
	/**
	 * 病猪数量
	 */
	
	private String bingzhushuliang;
		
	/**
	 * 处理方法
	 */
	
	private String chulifangfa;
		
	/**
	 * 处理结果
	 */
	
	private String chulijieguo;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
	/**
	 * 设置：登记时间
	 */
	 
	public void setDengjishijian(Date dengjishijian) {
		this.dengjishijian = dengjishijian;
	}
	
	/**
	 * 获取：登记时间
	 */
	public Date getDengjishijian() {
		return dengjishijian;
	}
				
	
	/**
	 * 设置：疾病名称
	 */
	 
	public void setJibingmingcheng(String jibingmingcheng) {
		this.jibingmingcheng = jibingmingcheng;
	}
	
	/**
	 * 获取：疾病名称
	 */
	public String getJibingmingcheng() {
		return jibingmingcheng;
	}
				
	
	/**
	 * 设置：病猪数量
	 */
	 
	public void setBingzhushuliang(String bingzhushuliang) {
		this.bingzhushuliang = bingzhushuliang;
	}
	
	/**
	 * 获取：病猪数量
	 */
	public String getBingzhushuliang() {
		return bingzhushuliang;
	}
				
	
	/**
	 * 设置：处理方法
	 */
	 
	public void setChulifangfa(String chulifangfa) {
		this.chulifangfa = chulifangfa;
	}
	
	/**
	 * 获取：处理方法
	 */
	public String getChulifangfa() {
		return chulifangfa;
	}
				
	
	/**
	 * 设置：处理结果
	 */
	 
	public void setChulijieguo(String chulijieguo) {
		this.chulijieguo = chulijieguo;
	}
	
	/**
	 * 获取：处理结果
	 */
	public String getChulijieguo() {
		return chulijieguo;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
			
}
