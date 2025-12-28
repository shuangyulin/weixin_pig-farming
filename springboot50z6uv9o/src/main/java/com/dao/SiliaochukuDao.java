package com.dao;

import com.entity.SiliaochukuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SiliaochukuVO;
import com.entity.view.SiliaochukuView;


/**
 * 饲料出库
 * 
 * @author 
 * @email 
 * @date 2025-02-28 14:48:49
 */
public interface SiliaochukuDao extends BaseMapper<SiliaochukuEntity> {
	
	List<SiliaochukuVO> selectListVO(@Param("ew") Wrapper<SiliaochukuEntity> wrapper);
	
	SiliaochukuVO selectVO(@Param("ew") Wrapper<SiliaochukuEntity> wrapper);
	
	List<SiliaochukuView> selectListView(@Param("ew") Wrapper<SiliaochukuEntity> wrapper);

	List<SiliaochukuView> selectListView(Pagination page,@Param("ew") Wrapper<SiliaochukuEntity> wrapper);

	
	SiliaochukuView selectView(@Param("ew") Wrapper<SiliaochukuEntity> wrapper);
	

}
