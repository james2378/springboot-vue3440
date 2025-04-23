package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HezuogongsiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HezuogongsiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HezuogongsiView;


/**
 * 合作公司
 *
 * @author 
 * @email 
 * @date 2022-03-31 19:53:19
 */
public interface HezuogongsiService extends IService<HezuogongsiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HezuogongsiVO> selectListVO(Wrapper<HezuogongsiEntity> wrapper);
   	
   	HezuogongsiVO selectVO(@Param("ew") Wrapper<HezuogongsiEntity> wrapper);
   	
   	List<HezuogongsiView> selectListView(Wrapper<HezuogongsiEntity> wrapper);
   	
   	HezuogongsiView selectView(@Param("ew") Wrapper<HezuogongsiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HezuogongsiEntity> wrapper);
   	

}

