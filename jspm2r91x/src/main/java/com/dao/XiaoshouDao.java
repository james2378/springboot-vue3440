package com.dao;

import com.entity.XiaoshouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaoshouVO;
import com.entity.view.XiaoshouView;


/**
 * 销售
 * 
 * @author 
 * @email 
 * @date 2022-03-31 19:53:19
 */
public interface XiaoshouDao extends BaseMapper<XiaoshouEntity> {
	
	List<XiaoshouVO> selectListVO(@Param("ew") Wrapper<XiaoshouEntity> wrapper);
	
	XiaoshouVO selectVO(@Param("ew") Wrapper<XiaoshouEntity> wrapper);
	
	List<XiaoshouView> selectListView(@Param("ew") Wrapper<XiaoshouEntity> wrapper);

	List<XiaoshouView> selectListView(Pagination page,@Param("ew") Wrapper<XiaoshouEntity> wrapper);
	
	XiaoshouView selectView(@Param("ew") Wrapper<XiaoshouEntity> wrapper);
	

}
