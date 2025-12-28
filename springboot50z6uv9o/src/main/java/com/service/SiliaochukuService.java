package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SiliaochukuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SiliaochukuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SiliaochukuView;


/**
 * 饲料出库
 *
 * @author 
 * @email 
 * @date 2025-02-28 14:48:49
 */
public interface SiliaochukuService extends IService<SiliaochukuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SiliaochukuVO> selectListVO(Wrapper<SiliaochukuEntity> wrapper);
   	
   	SiliaochukuVO selectVO(@Param("ew") Wrapper<SiliaochukuEntity> wrapper);
   	
   	List<SiliaochukuView> selectListView(Wrapper<SiliaochukuEntity> wrapper);
   	
   	SiliaochukuView selectView(@Param("ew") Wrapper<SiliaochukuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SiliaochukuEntity> wrapper);

   	

}

