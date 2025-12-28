package com.dao;

import com.entity.SiliaorukuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SiliaorukuVO;
import com.entity.view.SiliaorukuView;


/**
 * 饲料入库
 * 
 * @author 
 * @email 
 * @date 2025-02-28 14:48:49
 */
public interface SiliaorukuDao extends BaseMapper<SiliaorukuEntity> {
	
	List<SiliaorukuVO> selectListVO(@Param("ew") Wrapper<SiliaorukuEntity> wrapper);
	
	SiliaorukuVO selectVO(@Param("ew") Wrapper<SiliaorukuEntity> wrapper);
	
	List<SiliaorukuView> selectListView(@Param("ew") Wrapper<SiliaorukuEntity> wrapper);

	List<SiliaorukuView> selectListView(Pagination page,@Param("ew") Wrapper<SiliaorukuEntity> wrapper);

	
	SiliaorukuView selectView(@Param("ew") Wrapper<SiliaorukuEntity> wrapper);
	

}
