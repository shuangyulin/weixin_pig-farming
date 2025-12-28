package com.entity.model;

import com.entity.ShengzhuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 生猪信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2025-02-28 14:48:48
 */
public class ShengzhuxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 猪的品种
	 */
	
	private String zhudepinzhong;
		
	/**
	 * 出生日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
