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

import com.entity.SiliaochukuEntity;
import com.entity.view.SiliaochukuView;

import com.service.SiliaochukuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 饲料出库
 * 后端接口
 * @author 
 * @email 
 * @date 2025-02-28 14:48:49
 */
@RestController
@RequestMapping("/siliaochuku")
public class SiliaochukuController {
    @Autowired
    private SiliaochukuService siliaochukuService;






    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,SiliaochukuEntity siliaochuku,
		HttpServletRequest request){
        //设置查询条件
        EntityWrapper<SiliaochukuEntity> ew = new EntityWrapper<SiliaochukuEntity>();


        //查询结果
		PageUtils page = siliaochukuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, siliaochuku), params), params));
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
    public R list(@RequestParam Map<String, Object> params,SiliaochukuEntity siliaochuku, 
		HttpServletRequest request){
        //设置查询条件
        EntityWrapper<SiliaochukuEntity> ew = new EntityWrapper<SiliaochukuEntity>();

        //查询结果
		PageUtils page = siliaochukuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, siliaochuku), params), params));
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(page,deSens);
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( SiliaochukuEntity siliaochuku){
       	EntityWrapper<SiliaochukuEntity> ew = new EntityWrapper<SiliaochukuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( siliaochuku, "siliaochuku")); 
        return R.ok().put("data", siliaochukuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(SiliaochukuEntity siliaochuku){
        EntityWrapper< SiliaochukuEntity> ew = new EntityWrapper< SiliaochukuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( siliaochuku, "siliaochuku")); 
		SiliaochukuView siliaochukuView =  siliaochukuService.selectView(ew);
		return R.ok("查询饲料出库成功").put("data", siliaochukuView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        SiliaochukuEntity siliaochuku = siliaochukuService.selectById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(siliaochuku,deSens);
        return R.ok().put("data", siliaochuku);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        SiliaochukuEntity siliaochuku = siliaochukuService.selectById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(siliaochuku,deSens);
        return R.ok().put("data", siliaochuku);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SiliaochukuEntity siliaochuku, HttpServletRequest request){
        //ValidatorUtils.validateEntity(siliaochuku);
        siliaochukuService.insert(siliaochuku);
        return R.ok().put("data",siliaochuku.getId());
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody SiliaochukuEntity siliaochuku, HttpServletRequest request){
        //ValidatorUtils.validateEntity(siliaochuku);
        siliaochukuService.insert(siliaochuku);
        return R.ok().put("data",siliaochuku.getId());
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody SiliaochukuEntity siliaochuku, HttpServletRequest request){
        //ValidatorUtils.validateEntity(siliaochuku);
        //全部更新
        siliaochukuService.updateById(siliaochuku);
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        siliaochukuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    








}
