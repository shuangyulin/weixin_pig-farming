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


import com.dao.ChengzhangdengjiDao;
import com.entity.ChengzhangdengjiEntity;
import com.service.ChengzhangdengjiService;
import com.entity.vo.ChengzhangdengjiVO;
import com.entity.view.ChengzhangdengjiView;

@Service("chengzhangdengjiService")
public class ChengzhangdengjiServiceImpl extends ServiceImpl<ChengzhangdengjiDao, ChengzhangdengjiEntity> implements ChengzhangdengjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChengzhangdengjiEntity> page = this.selectPage(
                new Query<ChengzhangdengjiEntity>(params).getPage(),
                new EntityWrapper<ChengzhangdengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChengzhangdengjiEntity> wrapper) {
		  Page<ChengzhangdengjiView> page =new Query<ChengzhangdengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ChengzhangdengjiVO> selectListVO(Wrapper<ChengzhangdengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChengzhangdengjiVO selectVO(Wrapper<ChengzhangdengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChengzhangdengjiView> selectListView(Wrapper<ChengzhangdengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChengzhangdengjiView selectView(Wrapper<ChengzhangdengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<ChengzhangdengjiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<ChengzhangdengjiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<ChengzhangdengjiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
