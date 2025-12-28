package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.util.stream.Collectors;
import javax.servlet.http.HttpServletRequest;
import com.utils.ValidatorUtils;
import com.utils.DeSensUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.FangyijihuaEntity;
import com.entity.view.FangyijihuaView;

import com.service.FangyijihuaService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 防疫计划
 * 后端接口
 * @author 
 * @email 
 * @date 2025-02-28 14:48:49
 */
@RestController
@RequestMapping("/fangyijihua")
public class FangyijihuaController {
    @Autowired
    private FangyijihuaService fangyijihuaService;






    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,FangyijihuaEntity fangyijihua,
		HttpServletRequest request){
        //设置查询条件
        EntityWrapper<FangyijihuaEntity> ew = new EntityWrapper<FangyijihuaEntity>();


        //查询结果
		PageUtils page = fangyijihuaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fangyijihua), params), params));
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(page,deSens);
        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,FangyijihuaEntity fangyijihua, 
		HttpServletRequest request){
        //设置查询条件
        EntityWrapper<FangyijihuaEntity> ew = new EntityWrapper<FangyijihuaEntity>();

        //查询结果
		PageUtils page = fangyijihuaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fangyijihua), params), params));
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(page,deSens);
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( FangyijihuaEntity fangyijihua){
       	EntityWrapper<FangyijihuaEntity> ew = new EntityWrapper<FangyijihuaEntity>();
      	ew.allEq(MPUtil.allEQMapPre( fangyijihua, "fangyijihua")); 
        return R.ok().put("data", fangyijihuaService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(FangyijihuaEntity fangyijihua){
        EntityWrapper< FangyijihuaEntity> ew = new EntityWrapper< FangyijihuaEntity>();
 		ew.allEq(MPUtil.allEQMapPre( fangyijihua, "fangyijihua")); 
		FangyijihuaView fangyijihuaView =  fangyijihuaService.selectView(ew);
		return R.ok("查询防疫计划成功").put("data", fangyijihuaView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        FangyijihuaEntity fangyijihua = fangyijihuaService.selectById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(fangyijihua,deSens);
        return R.ok().put("data", fangyijihua);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        FangyijihuaEntity fangyijihua = fangyijihuaService.selectById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(fangyijihua,deSens);
        return R.ok().put("data", fangyijihua);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody FangyijihuaEntity fangyijihua, HttpServletRequest request){
        //ValidatorUtils.validateEntity(fangyijihua);
        fangyijihuaService.insert(fangyijihua);
        return R.ok().put("data",fangyijihua.getId());
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody FangyijihuaEntity fangyijihua, HttpServletRequest request){
        //ValidatorUtils.validateEntity(fangyijihua);
        fangyijihuaService.insert(fangyijihua);
        return R.ok().put("data",fangyijihua.getId());
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody FangyijihuaEntity fangyijihua, HttpServletRequest request){
        //ValidatorUtils.validateEntity(fangyijihua);
        //全部更新
        fangyijihuaService.updateById(fangyijihua);
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        fangyijihuaService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    








}
