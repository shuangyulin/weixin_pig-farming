package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhudepinzhongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhudepinzhongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhudepinzhongView;


/**
 * 猪的品种
 *
 * @author 
 * @email 
 * @date 2025-02-28 14:48:48
 */
public interface ZhudepinzhongService extends IService<ZhudepinzhongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhudepinzhongVO> selectListVO(Wrapper<ZhudepinzhongEntity> wrapper);
   	
   	ZhudepinzhongVO selectVO(@Param("ew") Wrapper<ZhudepinzhongEntity> wrapper);
   	
   	List<ZhudepinzhongView> selectListView(Wrapper<ZhudepinzhongEntity> wrapper);
   	
   	ZhudepinzhongView selectView(@Param("ew") Wrapper<ZhudepinzhongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhudepinzhongEntity> wrapper);

   	

}

