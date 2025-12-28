package com.dao;

import com.entity.DongwujianyiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DongwujianyiVO;
import com.entity.view.DongwujianyiView;


/**
 * 动物检疫
 * 
 * @author 
 * @email 
 * @date 2025-02-28 14:48:49
 */
public interface DongwujianyiDao extends BaseMapper<DongwujianyiEntity> {
	
	List<DongwujianyiVO> selectListVO(@Param("ew") Wrapper<DongwujianyiEntity> wrapper);
	
	DongwujianyiVO selectVO(@Param("ew") Wrapper<DongwujianyiEntity> wrapper);
	
	List<DongwujianyiView> selectListView(@Param("ew") Wrapper<DongwujianyiEntity> wrapper);

	List<DongwujianyiView> selectListView(Pagination page,@Param("ew") Wrapper<DongwujianyiEntity> wrapper);

	
	DongwujianyiView selectView(@Param("ew") Wrapper<DongwujianyiEntity> wrapper);
	

}
