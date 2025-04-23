package com.dao;

import com.entity.FuwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FuwuVO;
import com.entity.view.FuwuView;


/**
 * 服务
 * 
 * @author 
 * @email 
 * @date 2022-03-31 19:53:19
 */
public interface FuwuDao extends BaseMapper<FuwuEntity> {
	
	List<FuwuVO> selectListVO(@Param("ew") Wrapper<FuwuEntity> wrapper);
	
	FuwuVO selectVO(@Param("ew") Wrapper<FuwuEntity> wrapper);
	
	List<FuwuView> selectListView(@Param("ew") Wrapper<FuwuEntity> wrapper);

	List<FuwuView> selectListView(Pagination page,@Param("ew") Wrapper<FuwuEntity> wrapper);
	
	FuwuView selectView(@Param("ew") Wrapper<FuwuEntity> wrapper);
	

}
