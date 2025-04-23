package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaoshouEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaoshouVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaoshouView;


/**
 * 销售
 *
 * @author 
 * @email 
 * @date 2022-03-31 19:53:19
 */
public interface XiaoshouService extends IService<XiaoshouEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaoshouVO> selectListVO(Wrapper<XiaoshouEntity> wrapper);
   	
   	XiaoshouVO selectVO(@Param("ew") Wrapper<XiaoshouEntity> wrapper);
   	
   	List<XiaoshouView> selectListView(Wrapper<XiaoshouEntity> wrapper);
   	
   	XiaoshouView selectView(@Param("ew") Wrapper<XiaoshouEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaoshouEntity> wrapper);
   	

}

