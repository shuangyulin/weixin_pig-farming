package com.dao;

import com.entity.FangyijihuaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FangyijihuaVO;
import com.entity.view.FangyijihuaView;


/**
 * 防疫计划
 * 
 * @author 
 * @email 
 * @date 2025-02-28 14:48:49
 */
public interface FangyijihuaDao extends BaseMapper<FangyijihuaEntity> {
	
	List<FangyijihuaVO> selectListVO(@Param("ew") Wrapper<FangyijihuaEntity> wrapper);
	
	FangyijihuaVO selectVO(@Param("ew") Wrapper<FangyijihuaEntity> wrapper);
	
	List<FangyijihuaView> selectListView(@Param("ew") Wrapper<FangyijihuaEntity> wrapper);

	List<FangyijihuaView> selectListView(Pagination page,@Param("ew") Wrapper<FangyijihuaEntity> wrapper);

	
	FangyijihuaView selectView(@Param("ew") Wrapper<FangyijihuaEntity> wrapper);
	

}
