package com.entity.vo;

import com.entity.ChengzhangdengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 成长登记
 * @author 
 * @email 
 * @date 2025-02-28 14:48:48
 */
public class ChengzhangdengjiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 猪的品种
	 */
	
	private String zhudepinzhong;
		
	/**
	 * 阶段
	 */
	
	private String jieduan;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 登记日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjiriqi;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
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
	 * 设置：阶段
	 */
	 
	public void setJieduan(String jieduan) {
		this.jieduan = jieduan;
	}
	
	/**
	 * 获取：阶段
	 */
	public String getJieduan() {
		return jieduan;
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
	 * 设置：登记日期
	 */
	 
	public void setDengjiriqi(Date dengjiriqi) {
		this.dengjiriqi = dengjiriqi;
	}
	
	/**
	 * 获取：登记日期
	 */
	public Date getDengjiriqi() {
		return dengjiriqi;
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
