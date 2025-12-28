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
 * 健康记录
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2025-02-28 14:48:48
 */
@TableName("jiankangjilu")
public class JiankangjiluEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiankangjiluEntity() {
		
	}
	
	public JiankangjiluEntity(T t) {
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
	 * 生猪编号
	 */
					
	private String shengzhubianhao;
	
	/**
	 * 猪的品种
	 */
					
	private String zhudepinzhong;
	
	/**
	 * 登记时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	 * 设置：生猪编号
	 */
	public void setShengzhubianhao(String shengzhubianhao) {
		this.shengzhubianhao = shengzhubianhao;
	}
	/**
	 * 获取：生猪编号
	 */
	public String getShengzhubianhao() {
		return shengzhubianhao;
	}
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
