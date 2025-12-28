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


import com.dao.SiliaorukuDao;
import com.entity.SiliaorukuEntity;
import com.service.SiliaorukuService;
import com.entity.vo.SiliaorukuVO;
import com.entity.view.SiliaorukuView;

@Service("siliaorukuService")
public class SiliaorukuServiceImpl extends ServiceImpl<SiliaorukuDao, SiliaorukuEntity> implements SiliaorukuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SiliaorukuEntity> page = this.selectPage(
                new Query<SiliaorukuEntity>(params).getPage(),
                new EntityWrapper<SiliaorukuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SiliaorukuEntity> wrapper) {
		  Page<SiliaorukuView> page =new Query<SiliaorukuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<SiliaorukuVO> selectListVO(Wrapper<SiliaorukuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SiliaorukuVO selectVO(Wrapper<SiliaorukuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SiliaorukuView> selectListView(Wrapper<SiliaorukuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SiliaorukuView selectView(Wrapper<SiliaorukuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
