package com.dao;

import com.entity.JiankangjiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiankangjiluVO;
import com.entity.view.JiankangjiluView;


/**
 * 健康记录
 * 
 * @author 
 * @email 
 * @date 2025-02-28 14:48:48
 */
public interface JiankangjiluDao extends BaseMapper<JiankangjiluEntity> {
	
	List<JiankangjiluVO> selectListVO(@Param("ew") Wrapper<JiankangjiluEntity> wrapper);
	
	JiankangjiluVO selectVO(@Param("ew") Wrapper<JiankangjiluEntity> wrapper);
	
	List<JiankangjiluView> selectListView(@Param("ew") Wrapper<JiankangjiluEntity> wrapper);

	List<JiankangjiluView> selectListView(Pagination page,@Param("ew") Wrapper<JiankangjiluEntity> wrapper);

	
	JiankangjiluView selectView(@Param("ew") Wrapper<JiankangjiluEntity> wrapper);
	

}
