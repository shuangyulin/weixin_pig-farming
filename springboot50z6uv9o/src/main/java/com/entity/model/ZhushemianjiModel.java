package com.entity.model;

import com.entity.ZhushemianjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 猪舍面积
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2025-02-28 14:48:48
 */
public class ZhushemianjiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 猪舍区域
	 */
	
	private String zhushequyu;
		
	/**
	 * 总面积
	 */
	
	private String zongmianji;
		
	/**
	 * 存栏头数
	 */
	
	private Integer cunlantoushu;
				
	
	/**
	 * 设置：猪舍区域
	 */
	 
	public void setZhushequyu(String zhushequyu) {
		this.zhushequyu = zhushequyu;
	}
	
	/**
	 * 获取：猪舍区域
	 */
	public String getZhushequyu() {
		return zhushequyu;
	}
				
	
	/**
	 * 设置：总面积
	 */
	 
	public void setZongmianji(String zongmianji) {
		this.zongmianji = zongmianji;
	}
	
	/**
	 * 获取：总面积
	 */
	public String getZongmianji() {
		return zongmianji;
	}
				
	
	/**
	 * 设置：存栏头数
	 */
	 
	public void setCunlantoushu(Integer cunlantoushu) {
		this.cunlantoushu = cunlantoushu;
	}
	
	/**
	 * 获取：存栏头数
	 */
	public Integer getCunlantoushu() {
		return cunlantoushu;
	}
			
}
