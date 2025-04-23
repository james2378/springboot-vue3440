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


import com.dao.ShangpincaigouDao;
import com.entity.ShangpincaigouEntity;
import com.service.ShangpincaigouService;
import com.entity.vo.ShangpincaigouVO;
import com.entity.view.ShangpincaigouView;

@Service("shangpincaigouService")
public class ShangpincaigouServiceImpl extends ServiceImpl<ShangpincaigouDao, ShangpincaigouEntity> implements ShangpincaigouService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShangpincaigouEntity> page = this.selectPage(
                new Query<ShangpincaigouEntity>(params).getPage(),
                new EntityWrapper<ShangpincaigouEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShangpincaigouEntity> wrapper) {
		  Page<ShangpincaigouView> page =new Query<ShangpincaigouView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShangpincaigouVO> selectListVO(Wrapper<ShangpincaigouEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShangpincaigouVO selectVO(Wrapper<ShangpincaigouEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShangpincaigouView> selectListView(Wrapper<ShangpincaigouEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShangpincaigouView selectView(Wrapper<ShangpincaigouEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<ShangpincaigouEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<ShangpincaigouEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }
    
    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<ShangpincaigouEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
