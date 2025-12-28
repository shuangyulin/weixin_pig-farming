package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 饲料信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2025-02-28 14:48:49
 */
@TableName("siliaoxinxi")
public class SiliaoxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public SiliaoxinxiEntity() {
		
	}
	
	public SiliaoxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
    @TableId(type = IdType.AUTO)
	private Long id;
	/**
	 * 饲料编号
	 */
					
	private String siliaobianhao;
	
	/**
	 * 饲料名称
	 */
					
	private String siliaomingcheng;
	
	/**
	 * 饲料种类
	 */
					
	private String siliaozhonglei;
	
	/**
	 * 饲料封面
	 */
					
	private String siliaofengmian;
	
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
	 * 营养成分
	 */
					
	private String yingyangchengfen;
	
	/**
	 * 生产日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date shengchanriqi;
	
	/**
	 * 保质期
	 */
					
	private String baozhiqi;
	
	/**
	 * 供应商
	 */
					
	private String gongyingshang;
	
	/**
	 * 注意事项
	 */
					
	private String zhuyishixiang;
	
	/**
	 * 饲料详情
	 */
					
	private String siliaoxiangqing;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
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
	 * 设置：饲料种类
	 */
	public void setSiliaozhonglei(String siliaozhonglei) {
		this.siliaozhonglei = siliaozhonglei;
	}
	/**
	 * 获取：饲料种类
	 */
	public String getSiliaozhonglei() {
		return siliaozhonglei;
	}
	/**
	 * 设置：饲料封面
	 */
	public void setSiliaofengmian(String siliaofengmian) {
		this.siliaofengmian = siliaofengmian;
	}
	/**
	 * 获取：饲料封面
	 */
	public String getSiliaofengmian() {
		return siliaofengmian;
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
	 * 设置：营养成分
	 */
	public void setYingyangchengfen(String yingyangchengfen) {
		this.yingyangchengfen = yingyangchengfen;
	}
	/**
	 * 获取：营养成分
	 */
	public String getYingyangchengfen() {
		return yingyangchengfen;
	}
	/**
	 * 设置：生产日期
	 */
	public void setShengchanriqi(Date shengchanriqi) {
		this.shengchanriqi = shengchanriqi;
	}
	/**
	 * 获取：生产日期
	 */
	public Date getShengchanriqi() {
		return shengchanriqi;
	}
	/**
	 * 设置：保质期
	 */
	public void setBaozhiqi(String baozhiqi) {
		this.baozhiqi = baozhiqi;
	}
	/**
	 * 获取：保质期
	 */
	public String getBaozhiqi() {
		return baozhiqi;
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
	 * 设置：注意事项
	 */
	public void setZhuyishixiang(String zhuyishixiang) {
		this.zhuyishixiang = zhuyishixiang;
	}
	/**
	 * 获取：注意事项
	 */
	public String getZhuyishixiang() {
		return zhuyishixiang;
	}
	/**
	 * 设置：饲料详情
	 */
	public void setSiliaoxiangqing(String siliaoxiangqing) {
		this.siliaoxiangqing = siliaoxiangqing;
	}
	/**
	 * 获取：饲料详情
	 */
	public String getSiliaoxiangqing() {
		return siliaoxiangqing;
	}

}
