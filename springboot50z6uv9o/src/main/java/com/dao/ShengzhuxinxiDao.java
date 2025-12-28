package com.dao;

import com.entity.ShengzhuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShengzhuxinxiVO;
import com.entity.view.ShengzhuxinxiView;


/**
 * 生猪信息
 * 
 * @author 
 * @email 
 * @date 2025-02-28 14:48:48
 */
public interface ShengzhuxinxiDao extends BaseMapper<ShengzhuxinxiEntity> {
	
	List<ShengzhuxinxiVO> selectListVO(@Param("ew") Wrapper<ShengzhuxinxiEntity> wrapper);
	
	ShengzhuxinxiVO selectVO(@Param("ew") Wrapper<ShengzhuxinxiEntity> wrapper);
	
	List<ShengzhuxinxiView> selectListView(@Param("ew") Wrapper<ShengzhuxinxiEntity> wrapper);

	List<ShengzhuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ShengzhuxinxiEntity> wrapper);

	
	ShengzhuxinxiView selectView(@Param("ew") Wrapper<ShengzhuxinxiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ShengzhuxinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ShengzhuxinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ShengzhuxinxiEntity> wrapper);



}
