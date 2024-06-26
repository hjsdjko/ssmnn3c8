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
 * 会员制度
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-22 23:39:14
 */
@TableName("huiyuanzhidu")
public class HuiyuanzhiduEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HuiyuanzhiduEntity() {
		
	}
	
	public HuiyuanzhiduEntity(T t) {
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
	 * 会员名称
	 */
					
	private String huiyuanmingcheng;
	
	/**
	 * 会员类型
	 */
					
	private String huiyuanleixing;
	
	/**
	 * 会员待遇
	 */
					
	private String huiyuandaiyu;
	
	/**
	 * 办理价格
	 */
					
	private Integer banlijiage;
	
	/**
	 * 办理须知
	 */
					
	private String banlixuzhi;
	
	/**
	 * 发布日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date faburiqi;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	
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
	 * 设置：会员名称
	 */
	public void setHuiyuanmingcheng(String huiyuanmingcheng) {
		this.huiyuanmingcheng = huiyuanmingcheng;
	}
	/**
	 * 获取：会员名称
	 */
	public String getHuiyuanmingcheng() {
		return huiyuanmingcheng;
	}
	/**
	 * 设置：会员类型
	 */
	public void setHuiyuanleixing(String huiyuanleixing) {
		this.huiyuanleixing = huiyuanleixing;
	}
	/**
	 * 获取：会员类型
	 */
	public String getHuiyuanleixing() {
		return huiyuanleixing;
	}
	/**
	 * 设置：会员待遇
	 */
	public void setHuiyuandaiyu(String huiyuandaiyu) {
		this.huiyuandaiyu = huiyuandaiyu;
	}
	/**
	 * 获取：会员待遇
	 */
	public String getHuiyuandaiyu() {
		return huiyuandaiyu;
	}
	/**
	 * 设置：办理价格
	 */
	public void setBanlijiage(Integer banlijiage) {
		this.banlijiage = banlijiage;
	}
	/**
	 * 获取：办理价格
	 */
	public Integer getBanlijiage() {
		return banlijiage;
	}
	/**
	 * 设置：办理须知
	 */
	public void setBanlixuzhi(String banlixuzhi) {
		this.banlixuzhi = banlixuzhi;
	}
	/**
	 * 获取：办理须知
	 */
	public String getBanlixuzhi() {
		return banlixuzhi;
	}
	/**
	 * 设置：发布日期
	 */
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
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

}
