package com.entity.model;

import com.entity.SiliaorukuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 饲料入库
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2025-02-28 14:48:49
 */
public class SiliaorukuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 饲料编号
	 */
	
	private String siliaobianhao;
		
	/**
	 * 饲料名称
	 */
	
	private String siliaomingcheng;
		
	/**
	 * 饲料规格
	 */
	
	private String siliaoguige;
		
	/**
	 * 饲料价格
	 */
	
	private Double siliaojiage;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 供应商
	 */
	
	private String gongyingshang;
		
	/**
	 * 采购合同
	 */
	
	private String caigouhetong;
		
	/**
	 * 采购时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date caigoushijian;
				
	
	/**
	 * 设置：饲料编号
	 */
	 
	public void setSiliaobianhao(String siliaobianhao) {
		this.siliaobianhao = siliaobianhao;
	}
	
	/**
	 * 获取：饲料编号
	 */
	public String getSiliaobianhao() {
		return siliaobianhao;
	}
				
	
	/**
	 * 设置：饲料名称
	 */
	 
	public void setSiliaomingcheng(String siliaomingcheng) {
		this.siliaomingcheng = siliaomingcheng;
	}
	
	/**
	 * 获取：饲料名称
	 */
	public String getSiliaomingcheng() {
		return siliaomingcheng;
	}
				
	
	/**
	 * 设置：饲料规格
	 */
	 
	public void setSiliaoguige(String siliaoguige) {
		this.siliaoguige = siliaoguige;
	}
	
	/**
	 * 获取：饲料规格
	 */
	public String getSiliaoguige() {
		return siliaoguige;
	}
				
	
	/**
	 * 设置：饲料价格
	 */
	 
	public void setSiliaojiage(Double siliaojiage) {
		this.siliaojiage = siliaojiage;
	}
	
	/**
	 * 获取：饲料价格
	 */
	public Double getSiliaojiage() {
		return siliaojiage;
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
	 * 设置：供应商
	 */
	 
	public void setGongyingshang(String gongyingshang) {
		this.gongyingshang = gongyingshang;
	}
	
	/**
	 * 获取：供应商
	 */
	public String getGongyingshang() {
		return gongyingshang;
	}
				
	
	/**
	 * 设置：采购合同
	 */
	 
	public void setCaigouhetong(String caigouhetong) {
		this.caigouhetong = caigouhetong;
	}
	
	/**
	 * 获取：采购合同
	 */
	public String getCaigouhetong() {
		return caigouhetong;
	}
				
	
	/**
	 * 设置：采购时间
	 */
	 
	public void setCaigoushijian(Date caigoushijian) {
		this.caigoushijian = caigoushijian;
	}
	
	/**
	 * 获取：采购时间
	 */
	public Date getCaigoushijian() {
		return caigoushijian;
	}
			
}
