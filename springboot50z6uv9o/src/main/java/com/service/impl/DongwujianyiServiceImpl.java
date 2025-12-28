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


import com.dao.DongwujianyiDao;
import com.entity.DongwujianyiEntity;
import com.service.DongwujianyiService;
import com.entity.vo.DongwujianyiVO;
import com.entity.view.DongwujianyiView;

@Service("dongwujianyiService")
public class DongwujianyiServiceImpl extends ServiceImpl<DongwujianyiDao, DongwujianyiEntity> implements DongwujianyiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DongwujianyiEntity> page = this.selectPage(
                new Query<DongwujianyiEntity>(params).getPage(),
                new EntityWrapper<DongwujianyiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DongwujianyiEntity> wrapper) {
		  Page<DongwujianyiView> page =new Query<DongwujianyiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<DongwujianyiVO> selectListVO(Wrapper<DongwujianyiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DongwujianyiVO selectVO(Wrapper<DongwujianyiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DongwujianyiView> selectListView(Wrapper<DongwujianyiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DongwujianyiView selectView(Wrapper<DongwujianyiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
