package com.entity.model;

import com.entity.RongyuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 荣誉信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class RongyuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 标题
     */
    private String rongyuName;


    /**
     * 类型
     */
    private Integer rongyuTypes;


    /**
     * 封面
     */
    private String rongyuPhoto;


    /**
     * 发布教师
     */
    private Integer jiaoshiId;


    /**
     * 审核结果
     */
    private Integer rongyuYesnoTypes;


    /**
     * 详情
     */
    private String rongyuContent;


    /**
     * 假删
     */
    private Integer rongyuDelete;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：标题
	 */
    public String getRongyuName() {
        return rongyuName;
    }


    /**
	 * 设置：标题
	 */
    public void setRongyuName(String rongyuName) {
        this.rongyuName = rongyuName;
    }
    /**
	 * 获取：类型
	 */
    public Integer getRongyuTypes() {
        return rongyuTypes;
    }


    /**
	 * 设置：类型
	 */
    public void setRongyuTypes(Integer rongyuTypes) {
        this.rongyuTypes = rongyuTypes;
    }
    /**
	 * 获取：封面
	 */
    public String getRongyuPhoto() {
        return rongyuPhoto;
    }


    /**
	 * 设置：封面
	 */
    public void setRongyuPhoto(String rongyuPhoto) {
        this.rongyuPhoto = rongyuPhoto;
    }
    /**
	 * 获取：发布教师
	 */
    public Integer getJiaoshiId() {
        return jiaoshiId;
    }


    /**
	 * 设置：发布教师
	 */
    public void setJiaoshiId(Integer jiaoshiId) {
        this.jiaoshiId = jiaoshiId;
    }
    /**
	 * 获取：审核结果
	 */
    public Integer getRongyuYesnoTypes() {
        return rongyuYesnoTypes;
    }


    /**
	 * 设置：审核结果
	 */
    public void setRongyuYesnoTypes(Integer rongyuYesnoTypes) {
        this.rongyuYesnoTypes = rongyuYesnoTypes;
    }
    /**
	 * 获取：详情
	 */
    public String getRongyuContent() {
        return rongyuContent;
    }


    /**
	 * 设置：详情
	 */
    public void setRongyuContent(String rongyuContent) {
        this.rongyuContent = rongyuContent;
    }
    /**
	 * 获取：假删
	 */
    public Integer getRongyuDelete() {
        return rongyuDelete;
    }


    /**
	 * 设置：假删
	 */
    public void setRongyuDelete(Integer rongyuDelete) {
        this.rongyuDelete = rongyuDelete;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
