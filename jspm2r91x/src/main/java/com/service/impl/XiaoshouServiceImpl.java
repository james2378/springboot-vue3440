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


import com.dao.XiaoshouDao;
import com.entity.XiaoshouEntity;
import com.service.XiaoshouService;
import com.entity.vo.XiaoshouVO;
import com.entity.view.XiaoshouView;

@Service("xiaoshouService")
public class XiaoshouServiceImpl extends ServiceImpl<XiaoshouDao, XiaoshouEntity> implements XiaoshouService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaoshouEntity> page = this.selectPage(
                new Query<XiaoshouEntity>(params).getPage(),
                new EntityWrapper<XiaoshouEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaoshouEntity> wrapper) {
		  Page<XiaoshouView> page =new Query<XiaoshouView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaoshouVO> selectListVO(Wrapper<XiaoshouEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaoshouVO selectVO(Wrapper<XiaoshouEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaoshouView> selectListView(Wrapper<XiaoshouEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaoshouView selectView(Wrapper<XiaoshouEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
