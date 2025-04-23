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


import com.dao.HezuogongsiDao;
import com.entity.HezuogongsiEntity;
import com.service.HezuogongsiService;
import com.entity.vo.HezuogongsiVO;
import com.entity.view.HezuogongsiView;

@Service("hezuogongsiService")
public class HezuogongsiServiceImpl extends ServiceImpl<HezuogongsiDao, HezuogongsiEntity> implements HezuogongsiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HezuogongsiEntity> page = this.selectPage(
                new Query<HezuogongsiEntity>(params).getPage(),
                new EntityWrapper<HezuogongsiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HezuogongsiEntity> wrapper) {
		  Page<HezuogongsiView> page =new Query<HezuogongsiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HezuogongsiVO> selectListVO(Wrapper<HezuogongsiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HezuogongsiVO selectVO(Wrapper<HezuogongsiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HezuogongsiView> selectListView(Wrapper<HezuogongsiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HezuogongsiView selectView(Wrapper<HezuogongsiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
