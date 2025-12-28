package com.entity.model;

import com.entity.HuanjingtiaojianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 环境条件
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2025-02-28 14:48:48
 */
public class HuanjingtiaojianModel  implements Serializable {
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
