package com.dao;

import com.entity.ZhudepinzhongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhudepinzhongVO;
import com.entity.view.ZhudepinzhongView;


/**
 * 猪的品种
 * 
 * @author 
 * @email 
 * @date 2025-02-28 14:48:48
 */
public interface ZhudepinzhongDao extends BaseMapper<ZhudepinzhongEntity> {
	
	List<ZhudepinzhongVO> selectListVO(@Param("ew") Wrapper<ZhudepinzhongEntity> wrapper);
	
	ZhudepinzhongVO selectVO(@Param("ew") Wrapper<ZhudepinzhongEntity> wrapper);
	
	List<ZhudepinzhongView> selectListView(@Param("ew") Wrapper<ZhudepinzhongEntity> wrapper);

	List<ZhudepinzhongView> selectListView(Pagination page,@Param("ew") Wrapper<ZhudepinzhongEntity> wrapper);

	
	ZhudepinzhongView selectView(@Param("ew") Wrapper<ZhudepinzhongEntity> wrapper);
	

}
