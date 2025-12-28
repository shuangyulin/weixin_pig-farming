package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiankangjiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiankangjiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiankangjiluView;


/**
 * 健康记录
 *
 * @author 
 * @email 
 * @date 2025-02-28 14:48:48
 */
public interface JiankangjiluService extends IService<JiankangjiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiankangjiluVO> selectListVO(Wrapper<JiankangjiluEntity> wrapper);
   	
   	JiankangjiluVO selectVO(@Param("ew") Wrapper<JiankangjiluEntity> wrapper);
   	
   	List<JiankangjiluView> selectListView(Wrapper<JiankangjiluEntity> wrapper);
   	
   	JiankangjiluView selectView(@Param("ew") Wrapper<JiankangjiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiankangjiluEntity> wrapper);

   	

}

