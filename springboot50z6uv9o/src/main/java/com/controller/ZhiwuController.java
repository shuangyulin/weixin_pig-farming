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

import com.entity.ZhiwuEntity;
import com.entity.view.ZhiwuView;

import com.service.ZhiwuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 治污
 * 后端接口
 * @author 
 * @email 
 * @date 2025-02-28 14:48:48
 */
@RestController
@RequestMapping("/zhiwu")
public class ZhiwuController {
    @Autowired
    private ZhiwuService zhiwuService;






    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZhiwuEntity zhiwu,
		HttpServletRequest request){
        //设置查询条件
        EntityWrapper<ZhiwuEntity> ew = new EntityWrapper<ZhiwuEntity>();


        //查询结果
		PageUtils page = zhiwuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhiwu), params), params));
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
    public R list(@RequestParam Map<String, Object> params,ZhiwuEntity zhiwu, 
		HttpServletRequest request){
        //设置查询条件
        EntityWrapper<ZhiwuEntity> ew = new EntityWrapper<ZhiwuEntity>();

        //查询结果
		PageUtils page = zhiwuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhiwu), params), params));
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(page,deSens);
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZhiwuEntity zhiwu){
       	EntityWrapper<ZhiwuEntity> ew = new EntityWrapper<ZhiwuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zhiwu, "zhiwu")); 
        return R.ok().put("data", zhiwuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZhiwuEntity zhiwu){
        EntityWrapper< ZhiwuEntity> ew = new EntityWrapper< ZhiwuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zhiwu, "zhiwu")); 
		ZhiwuView zhiwuView =  zhiwuService.selectView(ew);
		return R.ok("查询治污成功").put("data", zhiwuView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZhiwuEntity zhiwu = zhiwuService.selectById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(zhiwu,deSens);
        return R.ok().put("data", zhiwu);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZhiwuEntity zhiwu = zhiwuService.selectById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(zhiwu,deSens);
        return R.ok().put("data", zhiwu);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZhiwuEntity zhiwu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zhiwu);
        zhiwuService.insert(zhiwu);
        return R.ok().put("data",zhiwu.getId());
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZhiwuEntity zhiwu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zhiwu);
        zhiwuService.insert(zhiwu);
        return R.ok().put("data",zhiwu.getId());
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ZhiwuEntity zhiwu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zhiwu);
        //全部更新
        zhiwuService.updateById(zhiwu);
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zhiwuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    








}
