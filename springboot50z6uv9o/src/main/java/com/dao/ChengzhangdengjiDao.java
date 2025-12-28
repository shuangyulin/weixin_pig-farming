package com.dao;

import com.entity.ChengzhangdengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChengzhangdengjiVO;
import com.entity.view.ChengzhangdengjiView;


/**
 * 成长登记
 * 
 * @author 
 * @email 
 * @date 2025-02-28 14:48:48
 */
public interface ChengzhangdengjiDao extends BaseMapper<ChengzhangdengjiEntity> {
	
	List<ChengzhangdengjiVO> selectListVO(@Param("ew") Wrapper<ChengzhangdengjiEntity> wrapper);
	
	ChengzhangdengjiVO selectVO(@Param("ew") Wrapper<ChengzhangdengjiEntity> wrapper);
	
	List<ChengzhangdengjiView> selectListView(@Param("ew") Wrapper<ChengzhangdengjiEntity> wrapper);

	List<ChengzhangdengjiView> selectListView(Pagination page,@Param("ew") Wrapper<ChengzhangdengjiEntity> wrapper);

	
	ChengzhangdengjiView selectView(@Param("ew") Wrapper<ChengzhangdengjiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ChengzhangdengjiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ChengzhangdengjiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ChengzhangdengjiEntity> wrapper);



}
