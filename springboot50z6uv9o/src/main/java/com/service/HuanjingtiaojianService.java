package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuanjingtiaojianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuanjingtiaojianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuanjingtiaojianView;


/**
 * 环境条件
 *
 * @author 
 * @email 
 * @date 2025-02-28 14:48:48
 */
public interface HuanjingtiaojianService extends IService<HuanjingtiaojianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuanjingtiaojianVO> selectListVO(Wrapper<HuanjingtiaojianEntity> wrapper);
   	
   	HuanjingtiaojianVO selectVO(@Param("ew") Wrapper<HuanjingtiaojianEntity> wrapper);
   	
   	List<HuanjingtiaojianView> selectListView(Wrapper<HuanjingtiaojianEntity> wrapper);
   	
   	HuanjingtiaojianView selectView(@Param("ew") Wrapper<HuanjingtiaojianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuanjingtiaojianEntity> wrapper);

   	

}

