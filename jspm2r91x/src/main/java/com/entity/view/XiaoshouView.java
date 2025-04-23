package com.entity.view;

import com.entity.XiaoshouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 销售
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-31 19:53:19
 */
@TableName("xiaoshou")
public class XiaoshouView  extends XiaoshouEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiaoshouView(){
	}
 
 	public XiaoshouView(XiaoshouEntity xiaoshouEntity){
 	try {
			BeanUtils.copyProperties(this, xiaoshouEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
