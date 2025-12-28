package com.entity.model;

import com.entity.NonghuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 农户
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2025-02-28 14:48:48
 */
public class NonghuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 密码
	 */
	
	private String mima;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 头像
	 */
	
	private String touxiang;
		
	/**
	 * 经验年限
	 */
	
	private String jingyannianxian;
		
	/**
	 * 养殖培训
	 */
	
	private String yangzhipeixun;
		
	/**
	 * 电子邮箱
	 */
	
	private String dianziyouxiang;
		
	/**
	 * 备用联系人
	 */
	
	private String beiyonglianxiren;
		
	/**
	 * 联系方式
	 */
	
	private String lianxifangshi;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：密码
	 */
	 
	public void setMima(String mima) {
		this.mima = mima;
	}
	
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
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
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：头像
	 */
	 
	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}
	
	/**
	 * 获取：头像
	 */
	public String getTouxiang() {
		return touxiang;
	}
				
	
	/**
	 * 设置：经验年限
	 */
	 
	public void setJingyannianxian(String jingyannianxian) {
		this.jingyannianxian = jingyannianxian;
	}
	
	/**
	 * 获取：经验年限
	 */
	public String getJingyannianxian() {
		return jingyannianxian;
	}
				
	
	/**
	 * 设置：养殖培训
	 */
	 
	public void setYangzhipeixun(String yangzhipeixun) {
		this.yangzhipeixun = yangzhipeixun;
	}
	
	/**
	 * 获取：养殖培训
	 */
	public String getYangzhipeixun() {
		return yangzhipeixun;
	}
				
	
	/**
	 * 设置：电子邮箱
	 */
	 
	public void setDianziyouxiang(String dianziyouxiang) {
		this.dianziyouxiang = dianziyouxiang;
	}
	
	/**
	 * 获取：电子邮箱
	 */
	public String getDianziyouxiang() {
		return dianziyouxiang;
	}
				
	
	/**
	 * 设置：备用联系人
	 */
	 
	public void setBeiyonglianxiren(String beiyonglianxiren) {
		this.beiyonglianxiren = beiyonglianxiren;
	}
	
	/**
	 * 获取：备用联系人
	 */
	public String getBeiyonglianxiren() {
		return beiyonglianxiren;
	}
				
	
	/**
	 * 设置：联系方式
	 */
	 
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
			
}
