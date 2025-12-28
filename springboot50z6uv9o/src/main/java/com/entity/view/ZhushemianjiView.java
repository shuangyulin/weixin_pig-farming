package com.entity.view;

import com.entity.ZhushemianjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 猪舍面积
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2025-02-28 14:48:48
 */
@TableName("zhushemianji")
public class ZhushemianjiView  extends ZhushemianjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhushemianjiView(){
	}
 
 	public ZhushemianjiView(ZhushemianjiEntity zhushemianjiEntity){
 	try {
			BeanUtils.copyProperties(this, zhushemianjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
