package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShengzhuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShengzhuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShengzhuxinxiView;


/**
 * 生猪信息
 *
 * @author 
 * @email 
 * @date 2025-02-28 14:48:48
 */
public interface ShengzhuxinxiService extends IService<ShengzhuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShengzhuxinxiVO> selectListVO(Wrapper<ShengzhuxinxiEntity> wrapper);
   	
   	ShengzhuxinxiVO selectVO(@Param("ew") Wrapper<ShengzhuxinxiEntity> wrapper);
   	
   	List<ShengzhuxinxiView> selectListView(Wrapper<ShengzhuxinxiEntity> wrapper);
   	
   	ShengzhuxinxiView selectView(@Param("ew") Wrapper<ShengzhuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShengzhuxinxiEntity> wrapper);

   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<ShengzhuxinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<ShengzhuxinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<ShengzhuxinxiEntity> wrapper);



}

