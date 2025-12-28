package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SiliaorukuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SiliaorukuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SiliaorukuView;


/**
 * 饲料入库
 *
 * @author 
 * @email 
 * @date 2025-02-28 14:48:49
 */
public interface SiliaorukuService extends IService<SiliaorukuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SiliaorukuVO> selectListVO(Wrapper<SiliaorukuEntity> wrapper);
   	
   	SiliaorukuVO selectVO(@Param("ew") Wrapper<SiliaorukuEntity> wrapper);
   	
   	List<SiliaorukuView> selectListView(Wrapper<SiliaorukuEntity> wrapper);
   	
   	SiliaorukuView selectView(@Param("ew") Wrapper<SiliaorukuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SiliaorukuEntity> wrapper);

   	

}

