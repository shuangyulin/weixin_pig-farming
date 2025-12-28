package com.dao;

import com.entity.HuanjingtiaojianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuanjingtiaojianVO;
import com.entity.view.HuanjingtiaojianView;


/**
 * 环境条件
 * 
 * @author 
 * @email 
 * @date 2025-02-28 14:48:48
 */
public interface HuanjingtiaojianDao extends BaseMapper<HuanjingtiaojianEntity> {
	
	List<HuanjingtiaojianVO> selectListVO(@Param("ew") Wrapper<HuanjingtiaojianEntity> wrapper);
	
	HuanjingtiaojianVO selectVO(@Param("ew") Wrapper<HuanjingtiaojianEntity> wrapper);
	
	List<HuanjingtiaojianView> selectListView(@Param("ew") Wrapper<HuanjingtiaojianEntity> wrapper);

	List<HuanjingtiaojianView> selectListView(Pagination page,@Param("ew") Wrapper<HuanjingtiaojianEntity> wrapper);

	
	HuanjingtiaojianView selectView(@Param("ew") Wrapper<HuanjingtiaojianEntity> wrapper);
	

}
