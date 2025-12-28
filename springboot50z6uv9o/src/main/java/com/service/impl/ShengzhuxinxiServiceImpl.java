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


import com.dao.ShengzhuxinxiDao;
import com.entity.ShengzhuxinxiEntity;
import com.service.ShengzhuxinxiService;
import com.entity.vo.ShengzhuxinxiVO;
import com.entity.view.ShengzhuxinxiView;

@Service("shengzhuxinxiService")
public class ShengzhuxinxiServiceImpl extends ServiceImpl<ShengzhuxinxiDao, ShengzhuxinxiEntity> implements ShengzhuxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShengzhuxinxiEntity> page = this.selectPage(
                new Query<ShengzhuxinxiEntity>(params).getPage(),
                new EntityWrapper<ShengzhuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShengzhuxinxiEntity> wrapper) {
		  Page<ShengzhuxinxiView> page =new Query<ShengzhuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ShengzhuxinxiVO> selectListVO(Wrapper<ShengzhuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShengzhuxinxiVO selectVO(Wrapper<ShengzhuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShengzhuxinxiView> selectListView(Wrapper<ShengzhuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShengzhuxinxiView selectView(Wrapper<ShengzhuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<ShengzhuxinxiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<ShengzhuxinxiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<ShengzhuxinxiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
