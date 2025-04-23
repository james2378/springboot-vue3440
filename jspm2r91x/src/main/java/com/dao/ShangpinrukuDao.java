package com.dao;

import com.entity.ShangpinrukuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShangpinrukuVO;
import com.entity.view.ShangpinrukuView;


/**
 * 商品入库
 * 
 * @author 
 * @email 
 * @date 2022-03-31 19:53:20
 */
public interface ShangpinrukuDao extends BaseMapper<ShangpinrukuEntity> {
	
	List<ShangpinrukuVO> selectListVO(@Param("ew") Wrapper<ShangpinrukuEntity> wrapper);
	
	ShangpinrukuVO selectVO(@Param("ew") Wrapper<ShangpinrukuEntity> wrapper);
	
	List<ShangpinrukuView> selectListView(@Param("ew") Wrapper<ShangpinrukuEntity> wrapper);

	List<ShangpinrukuView> selectListView(Pagination page,@Param("ew") Wrapper<ShangpinrukuEntity> wrapper);
	
	ShangpinrukuView selectView(@Param("ew") Wrapper<ShangpinrukuEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ShangpinrukuEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ShangpinrukuEntity> wrapper);
    
    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ShangpinrukuEntity> wrapper);
}
