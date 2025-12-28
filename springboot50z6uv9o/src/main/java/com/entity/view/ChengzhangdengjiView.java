package com.entity.view;

import com.entity.ChengzhangdengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 成长登记
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2025-02-28 14:48:48
 */
@TableName("chengzhangdengji")
public class ChengzhangdengjiView  extends ChengzhangdengjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChengzhangdengjiView(){
	}
 
 	public ChengzhangdengjiView(ChengzhangdengjiEntity chengzhangdengjiEntity){
 	try {
			BeanUtils.copyProperties(this, chengzhangdengjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
