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


import com.dao.JibingdengjiDao;
import com.entity.JibingdengjiEntity;
import com.service.JibingdengjiService;
import com.entity.vo.JibingdengjiVO;
import com.entity.view.JibingdengjiView;

@Service("jibingdengjiService")
public class JibingdengjiServiceImpl extends ServiceImpl<JibingdengjiDao, JibingdengjiEntity> implements JibingdengjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JibingdengjiEntity> page = this.selectPage(
                new Query<JibingdengjiEntity>(params).getPage(),
                new EntityWrapper<JibingdengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JibingdengjiEntity> wrapper) {
		  Page<JibingdengjiView> page =new Query<JibingdengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<JibingdengjiVO> selectListVO(Wrapper<JibingdengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JibingdengjiVO selectVO(Wrapper<JibingdengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JibingdengjiView> selectListView(Wrapper<JibingdengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JibingdengjiView selectView(Wrapper<JibingdengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
