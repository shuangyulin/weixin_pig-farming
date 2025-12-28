package com.entity.vo;

import com.entity.JiankangjiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 健康记录
 * @author 
 * @email 
 * @date 2025-02-28 14:48:48
 */
public class JiankangjiluVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 猪的品种
	 */
	
	private String zhudepinzhong;
		
	/**
	 * 登记时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjishijian;
		
	/**
	 * 疫苗接种
	 */
	
	private String yimiaojiezhong;
		
	/**
	 * 疫苗治疗
	 */
	
	private String yimiaozhiliao;
				
	
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
	 * 设置：疫苗接种
	 */
	 
	public void setYimiaojiezhong(String yimiaojiezhong) {
		this.yimiaojiezhong = yimiaojiezhong;
	}
	
	/**
	 * 获取：疫苗接种
	 */
	public String getYimiaojiezhong() {
		return yimiaojiezhong;
	}
				
	
	/**
	 * 设置：疫苗治疗
	 */
	 
	public void setYimiaozhiliao(String yimiaozhiliao) {
		this.yimiaozhiliao = yimiaozhiliao;
	}
	
	/**
	 * 获取：疫苗治疗
	 */
	public String getYimiaozhiliao() {
		return yimiaozhiliao;
	}
			
}
