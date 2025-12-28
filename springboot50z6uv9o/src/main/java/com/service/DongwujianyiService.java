package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DongwujianyiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DongwujianyiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DongwujianyiView;


/**
 * 动物检疫
 *
 * @author 
 * @email 
 * @date 2025-02-28 14:48:49
 */
public interface DongwujianyiService extends IService<DongwujianyiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DongwujianyiVO> selectListVO(Wrapper<DongwujianyiEntity> wrapper);
   	
   	DongwujianyiVO selectVO(@Param("ew") Wrapper<DongwujianyiEntity> wrapper);
   	
   	List<DongwujianyiView> selectListView(Wrapper<DongwujianyiEntity> wrapper);
   	
   	DongwujianyiView selectView(@Param("ew") Wrapper<DongwujianyiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DongwujianyiEntity> wrapper);

   	

}

