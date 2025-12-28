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

import com.entity.HuanjingtiaojianEntity;
import com.entity.view.HuanjingtiaojianView;

import com.service.HuanjingtiaojianService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 环境条件
 * 后端接口
 * @author 
 * @email 
 * @date 2025-02-28 14:48:48
 */
@RestController
@RequestMapping("/huanjingtiaojian")
public class HuanjingtiaojianController {
    @Autowired
    private HuanjingtiaojianService huanjingtiaojianService;






    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,HuanjingtiaojianEntity huanjingtiaojian,
		HttpServletRequest request){
        //设置查询条件
        EntityWrapper<HuanjingtiaojianEntity> ew = new EntityWrapper<HuanjingtiaojianEntity>();


        //查询结果
		PageUtils page = huanjingtiaojianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, huanjingtiaojian), params), params));
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
    public R list(@RequestParam Map<String, Object> params,HuanjingtiaojianEntity huanjingtiaojian, 
		HttpServletRequest request){
        //设置查询条件
        EntityWrapper<HuanjingtiaojianEntity> ew = new EntityWrapper<HuanjingtiaojianEntity>();

        //查询结果
		PageUtils page = huanjingtiaojianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, huanjingtiaojian), params), params));
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(page,deSens);
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( HuanjingtiaojianEntity huanjingtiaojian){
       	EntityWrapper<HuanjingtiaojianEntity> ew = new EntityWrapper<HuanjingtiaojianEntity>();
      	ew.allEq(MPUtil.allEQMapPre( huanjingtiaojian, "huanjingtiaojian")); 
        return R.ok().put("data", huanjingtiaojianService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(HuanjingtiaojianEntity huanjingtiaojian){
        EntityWrapper< HuanjingtiaojianEntity> ew = new EntityWrapper< HuanjingtiaojianEntity>();
 		ew.allEq(MPUtil.allEQMapPre( huanjingtiaojian, "huanjingtiaojian")); 
		HuanjingtiaojianView huanjingtiaojianView =  huanjingtiaojianService.selectView(ew);
		return R.ok("查询环境条件成功").put("data", huanjingtiaojianView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        HuanjingtiaojianEntity huanjingtiaojian = huanjingtiaojianService.selectById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(huanjingtiaojian,deSens);
        return R.ok().put("data", huanjingtiaojian);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        HuanjingtiaojianEntity huanjingtiaojian = huanjingtiaojianService.selectById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(huanjingtiaojian,deSens);
        return R.ok().put("data", huanjingtiaojian);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody HuanjingtiaojianEntity huanjingtiaojian, HttpServletRequest request){
        //ValidatorUtils.validateEntity(huanjingtiaojian);
        huanjingtiaojianService.insert(huanjingtiaojian);
        return R.ok().put("data",huanjingtiaojian.getId());
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody HuanjingtiaojianEntity huanjingtiaojian, HttpServletRequest request){
        //ValidatorUtils.validateEntity(huanjingtiaojian);
        huanjingtiaojianService.insert(huanjingtiaojian);
        return R.ok().put("data",huanjingtiaojian.getId());
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody HuanjingtiaojianEntity huanjingtiaojian, HttpServletRequest request){
        //ValidatorUtils.validateEntity(huanjingtiaojian);
        //全部更新
        huanjingtiaojianService.updateById(huanjingtiaojian);
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        huanjingtiaojianService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    








}
