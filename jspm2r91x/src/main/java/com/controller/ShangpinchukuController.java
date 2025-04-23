package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ShangpinchukuEntity;
import com.entity.view.ShangpinchukuView;

import com.service.ShangpinchukuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 商品出库
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-31 19:53:20
 */
@RestController
@RequestMapping("/shangpinchuku")
public class ShangpinchukuController {
    @Autowired
    private ShangpinchukuService shangpinchukuService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShangpinchukuEntity shangpinchuku, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date chukushijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date chukushijianend,
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("fuwu")) {
			shangpinchuku.setFuwuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShangpinchukuEntity> ew = new EntityWrapper<ShangpinchukuEntity>();
                if(chukushijianstart!=null) ew.ge("chukushijian", chukushijianstart);
                if(chukushijianend!=null) ew.le("chukushijian", chukushijianend);
    	PageUtils page = shangpinchukuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shangpinchuku), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShangpinchukuEntity shangpinchuku, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date chukushijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date chukushijianend,
		HttpServletRequest request){
        EntityWrapper<ShangpinchukuEntity> ew = new EntityWrapper<ShangpinchukuEntity>();
                if(chukushijianstart!=null) ew.ge("chukushijian", chukushijianstart);
                if(chukushijianend!=null) ew.le("chukushijian", chukushijianend);
    	PageUtils page = shangpinchukuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shangpinchuku), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShangpinchukuEntity shangpinchuku){
       	EntityWrapper<ShangpinchukuEntity> ew = new EntityWrapper<ShangpinchukuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shangpinchuku, "shangpinchuku")); 
        return R.ok().put("data", shangpinchukuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShangpinchukuEntity shangpinchuku){
        EntityWrapper< ShangpinchukuEntity> ew = new EntityWrapper< ShangpinchukuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shangpinchuku, "shangpinchuku")); 
		ShangpinchukuView shangpinchukuView =  shangpinchukuService.selectView(ew);
		return R.ok("查询商品出库成功").put("data", shangpinchukuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShangpinchukuEntity shangpinchuku = shangpinchukuService.selectById(id);
        return R.ok().put("data", shangpinchuku);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShangpinchukuEntity shangpinchuku = shangpinchukuService.selectById(id);
        return R.ok().put("data", shangpinchuku);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShangpinchukuEntity shangpinchuku, HttpServletRequest request){
    	shangpinchuku.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shangpinchuku);

        shangpinchukuService.insert(shangpinchuku);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShangpinchukuEntity shangpinchuku, HttpServletRequest request){
    	shangpinchuku.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shangpinchuku);

        shangpinchukuService.insert(shangpinchuku);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ShangpinchukuEntity shangpinchuku, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shangpinchuku);
        shangpinchukuService.updateById(shangpinchuku);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shangpinchukuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ShangpinchukuEntity> wrapper = new EntityWrapper<ShangpinchukuEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("fuwu")) {
			wrapper.eq("fuwuzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = shangpinchukuService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	





    /**
     * （按值统计）
     */
    @RequestMapping("/value/{xColumnName}/{yColumnName}")
    public R value(@PathVariable("yColumnName") String yColumnName, @PathVariable("xColumnName") String xColumnName,HttpServletRequest request) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("xColumn", xColumnName);
        params.put("yColumn", yColumnName);
        EntityWrapper<ShangpinchukuEntity> ew = new EntityWrapper<ShangpinchukuEntity>();
        String tableName = request.getSession().getAttribute("tableName").toString();
        if(tableName.equals("fuwu")) {
            ew.eq("fuwuzhanghao", (String)request.getSession().getAttribute("username"));
        }
        List<Map<String, Object>> result = shangpinchukuService.selectValue(params, ew);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Map<String, Object> m : result) {
            for(String k : m.keySet()) {
                if(m.get(k) instanceof Date) {
                    m.put(k, sdf.format((Date)m.get(k)));
                }
            }
        }
        return R.ok().put("data", result);
    }

    /**
     * （按值统计）时间统计类型
     */
    @RequestMapping("/value/{xColumnName}/{yColumnName}/{timeStatType}")
    public R valueDay(@PathVariable("yColumnName") String yColumnName, @PathVariable("xColumnName") String xColumnName, @PathVariable("timeStatType") String timeStatType,HttpServletRequest request) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("xColumn", xColumnName);
        params.put("yColumn", yColumnName);
        params.put("timeStatType", timeStatType);
        EntityWrapper<ShangpinchukuEntity> ew = new EntityWrapper<ShangpinchukuEntity>();
        String tableName = request.getSession().getAttribute("tableName").toString();
        if(tableName.equals("fuwu")) {
            ew.eq("fuwuzhanghao", (String)request.getSession().getAttribute("username"));
        }
        List<Map<String, Object>> result = shangpinchukuService.selectTimeStatValue(params, ew);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Map<String, Object> m : result) {
            for(String k : m.keySet()) {
                if(m.get(k) instanceof Date) {
                    m.put(k, sdf.format((Date)m.get(k)));
                }
            }
        }
        return R.ok().put("data", result);
    }
    
    /**
     * 分组统计
     */
    @RequestMapping("/group/{columnName}")
    public R group(@PathVariable("columnName") String columnName,HttpServletRequest request) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("column", columnName);
        EntityWrapper<ShangpinchukuEntity> ew = new EntityWrapper<ShangpinchukuEntity>();
        String tableName = request.getSession().getAttribute("tableName").toString();
        if(tableName.equals("fuwu")) {
            ew.eq("fuwuzhanghao", (String)request.getSession().getAttribute("username"));
        }
        List<Map<String, Object>> result = shangpinchukuService.selectGroup(params, ew);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Map<String, Object> m : result) {
            for(String k : m.keySet()) {
                if(m.get(k) instanceof Date) {
                    m.put(k, sdf.format((Date)m.get(k)));
                }
            }
        }
        return R.ok().put("data", result);
    }
}
