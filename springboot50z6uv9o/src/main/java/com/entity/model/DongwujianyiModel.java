package com.entity.model;

import com.entity.DongwujianyiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 动物检疫
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2025-02-28 14:48:49
 */
public class DongwujianyiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 猪的品种
	 */
	
	private String zhudepinzhong;
		
	/**
	 * 检疫时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
