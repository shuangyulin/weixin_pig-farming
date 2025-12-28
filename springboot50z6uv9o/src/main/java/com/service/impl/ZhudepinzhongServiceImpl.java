package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZhudepinzhongDao;
import com.entity.ZhudepinzhongEntity;
import com.service.ZhudepinzhongService;
import com.entity.vo.ZhudepinzhongVO;
import com.entity.view.ZhudepinzhongView;

@Service("zhudepinzhongService")
public class ZhudepinzhongServiceImpl extends ServiceImpl<ZhudepinzhongDao, ZhudepinzhongEntity> implements ZhudepinzhongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhudepinzhongEntity> page = this.selectPage(
                new Query<ZhudepinzhongEntity>(params).getPage(),
                new EntityWrapper<ZhudepinzhongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhudepinzhongEntity> wrapper) {
		  Page<ZhudepinzhongView> page =new Query<ZhudepinzhongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ZhudepinzhongVO> selectListVO(Wrapper<ZhudepinzhongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhudepinzhongVO selectVO(Wrapper<ZhudepinzhongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhudepinzhongView> selectListView(Wrapper<ZhudepinzhongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhudepinzhongView selectView(Wrapper<ZhudepinzhongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
