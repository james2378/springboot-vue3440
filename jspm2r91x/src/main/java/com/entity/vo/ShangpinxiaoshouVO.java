package com.entity.vo;

import com.entity.ShangpinxiaoshouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 商品销售
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-31 19:53:20
 */
public class ShangpinxiaoshouVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 商品名称
	 */
	
	private String shangpinmingcheng;
		
	/**
	 * 商品类型
	 */
	
	private String shangpinleixing;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 价格
	 */
	
	private Integer jiage;
		
	/**
	 * 总计
	 */
	
	private Float zongji;
		
	/**
	 * 产地
	 */
	
	private String chandi;
		
	/**
	 * 生产日期
	 */
	
	private String shengchanriqi;
		
	/**
	 * 保质期
	 */
	
	private String baozhiqi;
		
	/**
	 * 销售时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date xiaoshoushijian;
		
	/**
	 * 销售账号
	 */
	
	private String xiaoshouzhanghao;
		
	/**
	 * 销售人名
	 */
	
	private String xiaoshourenming;
		
	/**
	 * 销售说明
	 */
	
	private String xiaoshoushuoming;
				
	
	/**
	 * 设置：商品名称
	 */
	 
	public void setShangpinmingcheng(String shangpinmingcheng) {
		this.shangpinmingcheng = shangpinmingcheng;
	}
	
	/**
	 * 获取：商品名称
	 */
	public String getShangpinmingcheng() {
		return shangpinmingcheng;
	}
				
	
	/**
	 * 设置：商品类型
	 */
	 
	public void setShangpinleixing(String shangpinleixing) {
		this.shangpinleixing = shangpinleixing;
	}
	
	/**
	 * 获取：商品类型
	 */
	public String getShangpinleixing() {
		return shangpinleixing;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：数量
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setJiage(Integer jiage) {
		this.jiage = jiage;
	}
	
	/**
	 * 获取：价格
	 */
	public Integer getJiage() {
		return jiage;
	}
				
	
	/**
	 * 设置：总计
	 */
	 
	public void setZongji(Float zongji) {
		this.zongji = zongji;
	}
	
	/**
	 * 获取：总计
	 */
	public Float getZongji() {
		return zongji;
	}
				
	
	/**
	 * 设置：产地
	 */
	 
	public void setChandi(String chandi) {
		this.chandi = chandi;
	}
	
	/**
	 * 获取：产地
	 */
	public String getChandi() {
		return chandi;
	}
				
	
	/**
	 * 设置：生产日期
	 */
	 
	public void setShengchanriqi(String shengchanriqi) {
		this.shengchanriqi = shengchanriqi;
	}
	
	/**
	 * 获取：生产日期
	 */
	public String getShengchanriqi() {
		return shengchanriqi;
	}
				
	
	/**
	 * 设置：保质期
	 */
	 
	public void setBaozhiqi(String baozhiqi) {
		this.baozhiqi = baozhiqi;
	}
	
	/**
	 * 获取：保质期
	 */
	public String getBaozhiqi() {
		return baozhiqi;
	}
				
	
	/**
	 * 设置：销售时间
	 */
	 
	public void setXiaoshoushijian(Date xiaoshoushijian) {
		this.xiaoshoushijian = xiaoshoushijian;
	}
	
	/**
	 * 获取：销售时间
	 */
	public Date getXiaoshoushijian() {
		return xiaoshoushijian;
	}
				
	
	/**
	 * 设置：销售账号
	 */
	 
	public void setXiaoshouzhanghao(String xiaoshouzhanghao) {
		this.xiaoshouzhanghao = xiaoshouzhanghao;
	}
	
	/**
	 * 获取：销售账号
	 */
	public String getXiaoshouzhanghao() {
		return xiaoshouzhanghao;
	}
				
	
	/**
	 * 设置：销售人名
	 */
	 
	public void setXiaoshourenming(String xiaoshourenming) {
		this.xiaoshourenming = xiaoshourenming;
	}
	
	/**
	 * 获取：销售人名
	 */
	public String getXiaoshourenming() {
		return xiaoshourenming;
	}
				
	
	/**
	 * 设置：销售说明
	 */
	 
	public void setXiaoshoushuoming(String xiaoshoushuoming) {
		this.xiaoshoushuoming = xiaoshoushuoming;
	}
	
	/**
	 * 获取：销售说明
	 */
	public String getXiaoshoushuoming() {
		return xiaoshoushuoming;
	}
			
}
