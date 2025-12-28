package com.entity.vo;

import com.entity.SiliaochukuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 饲料出库
 * @author 
 * @email 
 * @date 2025-02-28 14:48:49
 */
public class SiliaochukuVO  implements Serializable {
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
	 * 投喂数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 猪舍编号
	 */
	
	private String zhushebianhao;
		
	/**
	 * 登记日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjiriqi;
				
	
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
	 * 设置：投喂数量
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：投喂数量
	 */
	public Integer getShuliang() {
		return shuliang;
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
	 * 设置：猪舍编号
	 */
	 
	public void setZhushebianhao(String zhushebianhao) {
		this.zhushebianhao = zhushebianhao;
	}
	
	/**
	 * 获取：猪舍编号
	 */
	public String getZhushebianhao() {
		return zhushebianhao;
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
			
}
