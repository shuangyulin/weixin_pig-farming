package com.dao;

import com.entity.ZhiwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhiwuVO;
import com.entity.view.ZhiwuView;


/**
 * 治污
 * 
 * @author 
 * @email 
 * @date 2025-02-28 14:48:48
 */
public interface ZhiwuDao extends BaseMapper<ZhiwuEntity> {
	
	List<ZhiwuVO> selectListVO(@Param("ew") Wrapper<ZhiwuEntity> wrapper);
	
	ZhiwuVO selectVO(@Param("ew") Wrapper<ZhiwuEntity> wrapper);
	
	List<ZhiwuView> selectListView(@Param("ew") Wrapper<ZhiwuEntity> wrapper);

	List<ZhiwuView> selectListView(Pagination page,@Param("ew") Wrapper<ZhiwuEntity> wrapper);

	
	ZhiwuView selectView(@Param("ew") Wrapper<ZhiwuEntity> wrapper);
	

}
