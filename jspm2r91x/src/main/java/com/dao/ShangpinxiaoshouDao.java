package com.dao;

import com.entity.ShangpinxiaoshouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShangpinxiaoshouVO;
import com.entity.view.ShangpinxiaoshouView;


/**
 * 商品销售
 * 
 * @author 
 * @email 
 * @date 2022-03-31 19:53:20
 */
public interface ShangpinxiaoshouDao extends BaseMapper<ShangpinxiaoshouEntity> {
	
	List<ShangpinxiaoshouVO> selectListVO(@Param("ew") Wrapper<ShangpinxiaoshouEntity> wrapper);
	
	ShangpinxiaoshouVO selectVO(@Param("ew") Wrapper<ShangpinxiaoshouEntity> wrapper);
	
	List<ShangpinxiaoshouView> selectListView(@Param("ew") Wrapper<ShangpinxiaoshouEntity> wrapper);

	List<ShangpinxiaoshouView> selectListView(Pagination page,@Param("ew") Wrapper<ShangpinxiaoshouEntity> wrapper);
	
	ShangpinxiaoshouView selectView(@Param("ew") Wrapper<ShangpinxiaoshouEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ShangpinxiaoshouEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ShangpinxiaoshouEntity> wrapper);
    
    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ShangpinxiaoshouEntity> wrapper);
}
