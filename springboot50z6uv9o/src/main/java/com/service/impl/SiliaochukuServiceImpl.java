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


import com.dao.SiliaochukuDao;
import com.entity.SiliaochukuEntity;
import com.service.SiliaochukuService;
import com.entity.vo.SiliaochukuVO;
import com.entity.view.SiliaochukuView;

@Service("siliaochukuService")
public class SiliaochukuServiceImpl extends ServiceImpl<SiliaochukuDao, SiliaochukuEntity> implements SiliaochukuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SiliaochukuEntity> page = this.selectPage(
                new Query<SiliaochukuEntity>(params).getPage(),
                new EntityWrapper<SiliaochukuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SiliaochukuEntity> wrapper) {
		  Page<SiliaochukuView> page =new Query<SiliaochukuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<SiliaochukuVO> selectListVO(Wrapper<SiliaochukuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SiliaochukuVO selectVO(Wrapper<SiliaochukuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SiliaochukuView> selectListView(Wrapper<SiliaochukuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SiliaochukuView selectView(Wrapper<SiliaochukuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
