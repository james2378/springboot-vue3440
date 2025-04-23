package com.dao;

import com.entity.ShangpinchukuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShangpinchukuVO;
import com.entity.view.ShangpinchukuView;


/**
 * 商品出库
 * 
 * @author 
 * @email 
 * @date 2022-03-31 19:53:20
 */
public interface ShangpinchukuDao extends BaseMapper<ShangpinchukuEntity> {
	
	List<ShangpinchukuVO> selectListVO(@Param("ew") Wrapper<ShangpinchukuEntity> wrapper);
	
	ShangpinchukuVO selectVO(@Param("ew") Wrapper<ShangpinchukuEntity> wrapper);
	
	List<ShangpinchukuView> selectListView(@Param("ew") Wrapper<ShangpinchukuEntity> wrapper);

	List<ShangpinchukuView> selectListView(Pagination page,@Param("ew") Wrapper<ShangpinchukuEntity> wrapper);
	
	ShangpinchukuView selectView(@Param("ew") Wrapper<ShangpinchukuEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ShangpinchukuEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ShangpinchukuEntity> wrapper);
    
    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ShangpinchukuEntity> wrapper);
}
