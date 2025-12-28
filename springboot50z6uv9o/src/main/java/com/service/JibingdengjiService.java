package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JibingdengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JibingdengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JibingdengjiView;


/**
 * 疾病登记
 *
 * @author 
 * @email 
 * @date 2025-02-28 14:48:48
 */
public interface JibingdengjiService extends IService<JibingdengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JibingdengjiVO> selectListVO(Wrapper<JibingdengjiEntity> wrapper);
   	
   	JibingdengjiVO selectVO(@Param("ew") Wrapper<JibingdengjiEntity> wrapper);
   	
   	List<JibingdengjiView> selectListView(Wrapper<JibingdengjiEntity> wrapper);
   	
   	JibingdengjiView selectView(@Param("ew") Wrapper<JibingdengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JibingdengjiEntity> wrapper);

   	

}

