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


import com.dao.HuanjingtiaojianDao;
import com.entity.HuanjingtiaojianEntity;
import com.service.HuanjingtiaojianService;
import com.entity.vo.HuanjingtiaojianVO;
import com.entity.view.HuanjingtiaojianView;

@Service("huanjingtiaojianService")
public class HuanjingtiaojianServiceImpl extends ServiceImpl<HuanjingtiaojianDao, HuanjingtiaojianEntity> implements HuanjingtiaojianService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuanjingtiaojianEntity> page = this.selectPage(
                new Query<HuanjingtiaojianEntity>(params).getPage(),
                new EntityWrapper<HuanjingtiaojianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuanjingtiaojianEntity> wrapper) {
		  Page<HuanjingtiaojianView> page =new Query<HuanjingtiaojianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<HuanjingtiaojianVO> selectListVO(Wrapper<HuanjingtiaojianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuanjingtiaojianVO selectVO(Wrapper<HuanjingtiaojianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuanjingtiaojianView> selectListView(Wrapper<HuanjingtiaojianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuanjingtiaojianView selectView(Wrapper<HuanjingtiaojianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
