package com.dao;

import com.entity.JibingdengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JibingdengjiVO;
import com.entity.view.JibingdengjiView;


/**
 * 疾病登记
 * 
 * @author 
 * @email 
 * @date 2025-02-28 14:48:48
 */
public interface JibingdengjiDao extends BaseMapper<JibingdengjiEntity> {
	
	List<JibingdengjiVO> selectListVO(@Param("ew") Wrapper<JibingdengjiEntity> wrapper);
	
	JibingdengjiVO selectVO(@Param("ew") Wrapper<JibingdengjiEntity> wrapper);
	
	List<JibingdengjiView> selectListView(@Param("ew") Wrapper<JibingdengjiEntity> wrapper);

	List<JibingdengjiView> selectListView(Pagination page,@Param("ew") Wrapper<JibingdengjiEntity> wrapper);

	
	JibingdengjiView selectView(@Param("ew") Wrapper<JibingdengjiEntity> wrapper);
	

}
