package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 商品采购
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-31 19:53:20
 */
@TableName("shangpincaigou")
public class ShangpincaigouEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShangpincaigouEntity() {
		
	}
	
	public ShangpincaigouEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 商品编号
	 */
					
	private String shangpinbianhao;
	
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
	 * 采购数量
	 */
					
	private Integer caigoushuliang;
	
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
	 * 采购时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date caigoushijian;
	
	/**
	 * 采购账号
	 */
					
	private String caigouzhanghao;
	
	/**
	 * 采购人名
	 */
					
	private String caigourenming;
	
	/**
	 * 采购说明
	 */
					
	private String caigoushuoming;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	/**
	 * 是否支付
	 */
					
	private String ispay;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：商品编号
	 */
	public void setShangpinbianhao(String shangpinbianhao) {
		this.shangpinbianhao = shangpinbianhao;
	}
	/**
	 * 获取：商品编号
	 */
	public String getShangpinbianhao() {
		return shangpinbianhao;
	}
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
	 * 设置：采购数量
	 */
	public void setCaigoushuliang(Integer caigoushuliang) {
		this.caigoushuliang = caigoushuliang;
	}
	/**
	 * 获取：采购数量
	 */
	public Integer getCaigoushuliang() {
		return caigoushuliang;
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
	 * 设置：采购时间
	 */
	public void setCaigoushijian(Date caigoushijian) {
		this.caigoushijian = caigoushijian;
	}
	/**
	 * 获取：采购时间
	 */
	public Date getCaigoushijian() {
		return caigoushijian;
	}
	/**
	 * 设置：采购账号
	 */
	public void setCaigouzhanghao(String caigouzhanghao) {
		this.caigouzhanghao = caigouzhanghao;
	}
	/**
	 * 获取：采购账号
	 */
	public String getCaigouzhanghao() {
		return caigouzhanghao;
	}
	/**
	 * 设置：采购人名
	 */
	public void setCaigourenming(String caigourenming) {
		this.caigourenming = caigourenming;
	}
	/**
	 * 获取：采购人名
	 */
	public String getCaigourenming() {
		return caigourenming;
	}
	/**
	 * 设置：采购说明
	 */
	public void setCaigoushuoming(String caigoushuoming) {
		this.caigoushuoming = caigoushuoming;
	}
	/**
	 * 获取：采购说明
	 */
	public String getCaigoushuoming() {
		return caigoushuoming;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
	/**
	 * 设置：是否支付
	 */
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}

}
