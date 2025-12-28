package com.entity.view;

import com.entity.SiliaorukuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 饲料入库
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2025-02-28 14:48:49
 */
@TableName("siliaoruku")
public class SiliaorukuView  extends SiliaorukuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public SiliaorukuView(){
	}
 
 	public SiliaorukuView(SiliaorukuEntity siliaorukuEntity){
 	try {
			BeanUtils.copyProperties(this, siliaorukuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
