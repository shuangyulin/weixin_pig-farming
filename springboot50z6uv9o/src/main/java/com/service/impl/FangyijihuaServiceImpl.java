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


import com.dao.FangyijihuaDao;
import com.entity.FangyijihuaEntity;
import com.service.FangyijihuaService;
import com.entity.vo.FangyijihuaVO;
import com.entity.view.FangyijihuaView;

@Service("fangyijihuaService")
public class FangyijihuaServiceImpl extends ServiceImpl<FangyijihuaDao, FangyijihuaEntity> implements FangyijihuaService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FangyijihuaEntity> page = this.selectPage(
                new Query<FangyijihuaEntity>(params).getPage(),
                new EntityWrapper<FangyijihuaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FangyijihuaEntity> wrapper) {
		  Page<FangyijihuaView> page =new Query<FangyijihuaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<FangyijihuaVO> selectListVO(Wrapper<FangyijihuaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FangyijihuaVO selectVO(Wrapper<FangyijihuaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FangyijihuaView> selectListView(Wrapper<FangyijihuaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FangyijihuaView selectView(Wrapper<FangyijihuaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
