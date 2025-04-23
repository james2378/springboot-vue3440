package com.dao;

import com.entity.ShangpincaigouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShangpincaigouVO;
import com.entity.view.ShangpincaigouView;


/**
 * 商品采购
 * 
 * @author 
 * @email 
 * @date 2022-03-31 19:53:20
 */
public interface ShangpincaigouDao extends BaseMapper<ShangpincaigouEntity> {
	
	List<ShangpincaigouVO> selectListVO(@Param("ew") Wrapper<ShangpincaigouEntity> wrapper);
	
	ShangpincaigouVO selectVO(@Param("ew") Wrapper<ShangpincaigouEntity> wrapper);
	
	List<ShangpincaigouView> selectListView(@Param("ew") Wrapper<ShangpincaigouEntity> wrapper);

	List<ShangpincaigouView> selectListView(Pagination page,@Param("ew") Wrapper<ShangpincaigouEntity> wrapper);
	
	ShangpincaigouView selectView(@Param("ew") Wrapper<ShangpincaigouEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ShangpincaigouEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ShangpincaigouEntity> wrapper);
    
    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ShangpincaigouEntity> wrapper);
}
