package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhushemianjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhushemianjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhushemianjiView;


/**
 * 猪舍面积
 *
 * @author 
 * @email 
 * @date 2025-02-28 14:48:48
 */
public interface ZhushemianjiService extends IService<ZhushemianjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhushemianjiVO> selectListVO(Wrapper<ZhushemianjiEntity> wrapper);
   	
   	ZhushemianjiVO selectVO(@Param("ew") Wrapper<ZhushemianjiEntity> wrapper);
   	
   	List<ZhushemianjiView> selectListView(Wrapper<ZhushemianjiEntity> wrapper);
   	
   	ZhushemianjiView selectView(@Param("ew") Wrapper<ZhushemianjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhushemianjiEntity> wrapper);

   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<ZhushemianjiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<ZhushemianjiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<ZhushemianjiEntity> wrapper);



}

