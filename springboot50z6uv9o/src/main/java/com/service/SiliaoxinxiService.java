package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SiliaoxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SiliaoxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SiliaoxinxiView;


/**
 * 饲料信息
 *
 * @author 
 * @email 
 * @date 2025-02-28 14:48:49
 */
public interface SiliaoxinxiService extends IService<SiliaoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SiliaoxinxiVO> selectListVO(Wrapper<SiliaoxinxiEntity> wrapper);
   	
   	SiliaoxinxiVO selectVO(@Param("ew") Wrapper<SiliaoxinxiEntity> wrapper);
   	
   	List<SiliaoxinxiView> selectListView(Wrapper<SiliaoxinxiEntity> wrapper);
   	
   	SiliaoxinxiView selectView(@Param("ew") Wrapper<SiliaoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SiliaoxinxiEntity> wrapper);

   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<SiliaoxinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<SiliaoxinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<SiliaoxinxiEntity> wrapper);



}

