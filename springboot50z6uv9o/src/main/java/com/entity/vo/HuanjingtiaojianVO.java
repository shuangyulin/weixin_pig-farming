package com.entity.vo;

import com.entity.HuanjingtiaojianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 环境条件
 * @author 
 * @email 
 * @date 2025-02-28 14:48:48
 */
public class HuanjingtiaojianVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
