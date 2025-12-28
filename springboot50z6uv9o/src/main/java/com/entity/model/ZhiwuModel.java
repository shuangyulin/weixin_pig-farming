package com.entity.model;

import com.entity.ZhiwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 治污
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2025-02-28 14:48:48
 */
public class ZhiwuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
