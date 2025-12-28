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

import com.entity.JibingdengjiEntity;
import com.entity.view.JibingdengjiView;

import com.service.JibingdengjiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 疾病登记
 * 后端接口
 * @author 
 * @email 
 * @date 2025-02-28 14:48:48
 */
@RestController
@RequestMapping("/jibingdengji")
public class JibingdengjiController {
    @Autowired
    private JibingdengjiService jibingdengjiService;






    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JibingdengjiEntity jibingdengji,
		HttpServletRequest request){
        //设置查询条件
        EntityWrapper<JibingdengjiEntity> ew = new EntityWrapper<JibingdengjiEntity>();


        //查询结果
		PageUtils page = jibingdengjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jibingdengji), params), params));
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
    public R list(@RequestParam Map<String, Object> params,JibingdengjiEntity jibingdengji, 
		HttpServletRequest request){
        //设置查询条件
        EntityWrapper<JibingdengjiEntity> ew = new EntityWrapper<JibingdengjiEntity>();

        //查询结果
		PageUtils page = jibingdengjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jibingdengji), params), params));
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(page,deSens);
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JibingdengjiEntity jibingdengji){
       	EntityWrapper<JibingdengjiEntity> ew = new EntityWrapper<JibingdengjiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jibingdengji, "jibingdengji")); 
        return R.ok().put("data", jibingdengjiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JibingdengjiEntity jibingdengji){
        EntityWrapper< JibingdengjiEntity> ew = new EntityWrapper< JibingdengjiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jibingdengji, "jibingdengji")); 
		JibingdengjiView jibingdengjiView =  jibingdengjiService.selectView(ew);
		return R.ok("查询疾病登记成功").put("data", jibingdengjiView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JibingdengjiEntity jibingdengji = jibingdengjiService.selectById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(jibingdengji,deSens);
        return R.ok().put("data", jibingdengji);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JibingdengjiEntity jibingdengji = jibingdengjiService.selectById(id);
        Map<String, String> deSens = new HashMap<>();
        //给需要脱敏的字段脱敏
        DeSensUtil.desensitize(jibingdengji,deSens);
        return R.ok().put("data", jibingdengji);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JibingdengjiEntity jibingdengji, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jibingdengji);
        jibingdengjiService.insert(jibingdengji);
        return R.ok().put("data",jibingdengji.getId());
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JibingdengjiEntity jibingdengji, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jibingdengji);
        jibingdengjiService.insert(jibingdengji);
        return R.ok().put("data",jibingdengji.getId());
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JibingdengjiEntity jibingdengji, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jibingdengji);
        //全部更新
        jibingdengjiService.updateById(jibingdengji);
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jibingdengjiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    








}
