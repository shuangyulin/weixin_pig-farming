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


import com.dao.ZhushemianjiDao;
import com.entity.ZhushemianjiEntity;
import com.service.ZhushemianjiService;
import com.entity.vo.ZhushemianjiVO;
import com.entity.view.ZhushemianjiView;

@Service("zhushemianjiService")
public class ZhushemianjiServiceImpl extends ServiceImpl<ZhushemianjiDao, ZhushemianjiEntity> implements ZhushemianjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhushemianjiEntity> page = this.selectPage(
                new Query<ZhushemianjiEntity>(params).getPage(),
                new EntityWrapper<ZhushemianjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhushemianjiEntity> wrapper) {
		  Page<ZhushemianjiView> page =new Query<ZhushemianjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ZhushemianjiVO> selectListVO(Wrapper<ZhushemianjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhushemianjiVO selectVO(Wrapper<ZhushemianjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhushemianjiView> selectListView(Wrapper<ZhushemianjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhushemianjiView selectView(Wrapper<ZhushemianjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<ZhushemianjiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<ZhushemianjiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<ZhushemianjiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
