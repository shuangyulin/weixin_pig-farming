package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChengzhangdengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChengzhangdengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChengzhangdengjiView;


/**
 * 成长登记
 *
 * @author 
 * @email 
 * @date 2025-02-28 14:48:48
 */
public interface ChengzhangdengjiService extends IService<ChengzhangdengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChengzhangdengjiVO> selectListVO(Wrapper<ChengzhangdengjiEntity> wrapper);
   	
   	ChengzhangdengjiVO selectVO(@Param("ew") Wrapper<ChengzhangdengjiEntity> wrapper);
   	
   	List<ChengzhangdengjiView> selectListView(Wrapper<ChengzhangdengjiEntity> wrapper);
   	
   	ChengzhangdengjiView selectView(@Param("ew") Wrapper<ChengzhangdengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChengzhangdengjiEntity> wrapper);

   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<ChengzhangdengjiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<ChengzhangdengjiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<ChengzhangdengjiEntity> wrapper);



}

