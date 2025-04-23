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


import com.dao.FuwuDao;
import com.entity.FuwuEntity;
import com.service.FuwuService;
import com.entity.vo.FuwuVO;
import com.entity.view.FuwuView;

@Service("fuwuService")
public class FuwuServiceImpl extends ServiceImpl<FuwuDao, FuwuEntity> implements FuwuService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FuwuEntity> page = this.selectPage(
                new Query<FuwuEntity>(params).getPage(),
                new EntityWrapper<FuwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FuwuEntity> wrapper) {
		  Page<FuwuView> page =new Query<FuwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FuwuVO> selectListVO(Wrapper<FuwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FuwuVO selectVO(Wrapper<FuwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FuwuView> selectListView(Wrapper<FuwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FuwuView selectView(Wrapper<FuwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
