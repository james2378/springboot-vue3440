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


import com.dao.ShangpinxiaoshouDao;
import com.entity.ShangpinxiaoshouEntity;
import com.service.ShangpinxiaoshouService;
import com.entity.vo.ShangpinxiaoshouVO;
import com.entity.view.ShangpinxiaoshouView;

@Service("shangpinxiaoshouService")
public class ShangpinxiaoshouServiceImpl extends ServiceImpl<ShangpinxiaoshouDao, ShangpinxiaoshouEntity> implements ShangpinxiaoshouService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShangpinxiaoshouEntity> page = this.selectPage(
                new Query<ShangpinxiaoshouEntity>(params).getPage(),
                new EntityWrapper<ShangpinxiaoshouEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShangpinxiaoshouEntity> wrapper) {
		  Page<ShangpinxiaoshouView> page =new Query<ShangpinxiaoshouView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShangpinxiaoshouVO> selectListVO(Wrapper<ShangpinxiaoshouEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShangpinxiaoshouVO selectVO(Wrapper<ShangpinxiaoshouEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShangpinxiaoshouView> selectListView(Wrapper<ShangpinxiaoshouEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShangpinxiaoshouView selectView(Wrapper<ShangpinxiaoshouEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<ShangpinxiaoshouEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<ShangpinxiaoshouEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }
    
    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<ShangpinxiaoshouEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
