package com.dao;

import com.entity.HezuogongsiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HezuogongsiVO;
import com.entity.view.HezuogongsiView;


/**
 * 合作公司
 * 
 * @author 
 * @email 
 * @date 2022-03-31 19:53:19
 */
public interface HezuogongsiDao extends BaseMapper<HezuogongsiEntity> {
	
	List<HezuogongsiVO> selectListVO(@Param("ew") Wrapper<HezuogongsiEntity> wrapper);
	
	HezuogongsiVO selectVO(@Param("ew") Wrapper<HezuogongsiEntity> wrapper);
	
	List<HezuogongsiView> selectListView(@Param("ew") Wrapper<HezuogongsiEntity> wrapper);

	List<HezuogongsiView> selectListView(Pagination page,@Param("ew") Wrapper<HezuogongsiEntity> wrapper);
	
	HezuogongsiView selectView(@Param("ew") Wrapper<HezuogongsiEntity> wrapper);
	

}
