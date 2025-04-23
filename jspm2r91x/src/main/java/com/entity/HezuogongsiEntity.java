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
 * 合作公司
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-31 19:53:19
 */
@TableName("hezuogongsi")
public class HezuogongsiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HezuogongsiEntity() {
		
	}
	
	public HezuogongsiEntity(T t) {
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
	 * 公司编号
	 */
					
	private String gongsibianhao;
	
	/**
	 * 公司名称
	 */
					
	private String gongsimingcheng;
	
	/**
	 * 联系人
	 */
					
	private String lianxiren;
	
	/**
	 * 联系电话
	 */
					
	private String lianxidianhua;
	
	/**
	 * 公司简介
	 */
					
	private String gongsijianjie;
	
	
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
	 * 设置：公司编号
	 */
	public void setGongsibianhao(String gongsibianhao) {
		this.gongsibianhao = gongsibianhao;
	}
	/**
	 * 获取：公司编号
	 */
	public String getGongsibianhao() {
		return gongsibianhao;
	}
	/**
	 * 设置：公司名称
	 */
	public void setGongsimingcheng(String gongsimingcheng) {
		this.gongsimingcheng = gongsimingcheng;
	}
	/**
	 * 获取：公司名称
	 */
	public String getGongsimingcheng() {
		return gongsimingcheng;
	}
	/**
	 * 设置：联系人
	 */
	public void setLianxiren(String lianxiren) {
		this.lianxiren = lianxiren;
	}
	/**
	 * 获取：联系人
	 */
	public String getLianxiren() {
		return lianxiren;
	}
	/**
	 * 设置：联系电话
	 */
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
	/**
	 * 设置：公司简介
	 */
	public void setGongsijianjie(String gongsijianjie) {
		this.gongsijianjie = gongsijianjie;
	}
	/**
	 * 获取：公司简介
	 */
	public String getGongsijianjie() {
		return gongsijianjie;
	}

}
