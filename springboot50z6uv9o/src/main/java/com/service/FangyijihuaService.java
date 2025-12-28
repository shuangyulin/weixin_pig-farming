package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FangyijihuaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FangyijihuaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FangyijihuaView;


/**
 * 防疫计划
 *
 * @author 
 * @email 
 * @date 2025-02-28 14:48:49
 */
public interface FangyijihuaService extends IService<FangyijihuaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FangyijihuaVO> selectListVO(Wrapper<FangyijihuaEntity> wrapper);
   	
   	FangyijihuaVO selectVO(@Param("ew") Wrapper<FangyijihuaEntity> wrapper);
   	
   	List<FangyijihuaView> selectListView(Wrapper<FangyijihuaEntity> wrapper);
   	
   	FangyijihuaView selectView(@Param("ew") Wrapper<FangyijihuaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FangyijihuaEntity> wrapper);

   	

}

