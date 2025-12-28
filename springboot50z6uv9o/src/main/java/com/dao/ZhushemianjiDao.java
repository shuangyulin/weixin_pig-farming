package com.dao;

import com.entity.ZhushemianjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhushemianjiVO;
import com.entity.view.ZhushemianjiView;


/**
 * 猪舍面积
 * 
 * @author 
 * @email 
 * @date 2025-02-28 14:48:48
 */
public interface ZhushemianjiDao extends BaseMapper<ZhushemianjiEntity> {
	
	List<ZhushemianjiVO> selectListVO(@Param("ew") Wrapper<ZhushemianjiEntity> wrapper);
	
	ZhushemianjiVO selectVO(@Param("ew") Wrapper<ZhushemianjiEntity> wrapper);
	
	List<ZhushemianjiView> selectListView(@Param("ew") Wrapper<ZhushemianjiEntity> wrapper);

	List<ZhushemianjiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhushemianjiEntity> wrapper);

	
	ZhushemianjiView selectView(@Param("ew") Wrapper<ZhushemianjiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZhushemianjiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZhushemianjiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZhushemianjiEntity> wrapper);



}
