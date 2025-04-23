package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FuwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FuwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FuwuView;


/**
 * 服务
 *
 * @author 
 * @email 
 * @date 2022-03-31 19:53:19
 */
public interface FuwuService extends IService<FuwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FuwuVO> selectListVO(Wrapper<FuwuEntity> wrapper);
   	
   	FuwuVO selectVO(@Param("ew") Wrapper<FuwuEntity> wrapper);
   	
   	List<FuwuView> selectListView(Wrapper<FuwuEntity> wrapper);
   	
   	FuwuView selectView(@Param("ew") Wrapper<FuwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FuwuEntity> wrapper);
   	

}

