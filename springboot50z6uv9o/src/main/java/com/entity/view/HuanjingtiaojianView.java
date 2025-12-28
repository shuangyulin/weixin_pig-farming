package com.entity.view;

import com.entity.HuanjingtiaojianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 环境条件
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2025-02-28 14:48:48
 */
@TableName("huanjingtiaojian")
public class HuanjingtiaojianView  extends HuanjingtiaojianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuanjingtiaojianView(){
	}
 
 	public HuanjingtiaojianView(HuanjingtiaojianEntity huanjingtiaojianEntity){
 	try {
			BeanUtils.copyProperties(this, huanjingtiaojianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
