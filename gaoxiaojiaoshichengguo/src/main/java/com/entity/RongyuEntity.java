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
 * 荣誉信息
 *
 * @author 
 * @email
 */
@TableName("rongyu")
public class RongyuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public RongyuEntity() {

	}

	public RongyuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 标题
     */
    @TableField(value = "rongyu_name")

    private String rongyuName;


    /**
     * 类型
     */
    @TableField(value = "rongyu_types")

    private Integer rongyuTypes;


    /**
     * 封面
     */
    @TableField(value = "rongyu_photo")

    private String rongyuPhoto;


    /**
     * 发布教师
     */
    @TableField(value = "jiaoshi_id")

    private Integer jiaoshiId;


    /**
     * 审核结果
     */
    @TableField(value = "rongyu_yesno_types")

    private Integer rongyuYesnoTypes;


    /**
     * 详情
     */
    @TableField(value = "rongyu_content")

    private String rongyuContent;


    /**
     * 假删
     */
    @TableField(value = "rongyu_delete")

    private Integer rongyuDelete;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：标题
	 */
    public String getRongyuName() {
        return rongyuName;
    }


    /**
	 * 获取：标题
	 */

    public void setRongyuName(String rongyuName) {
        this.rongyuName = rongyuName;
    }
    /**
	 * 设置：类型
	 */
    public Integer getRongyuTypes() {
        return rongyuTypes;
    }


    /**
	 * 获取：类型
	 */

    public void setRongyuTypes(Integer rongyuTypes) {
        this.rongyuTypes = rongyuTypes;
    }
    /**
	 * 设置：封面
	 */
    public String getRongyuPhoto() {
        return rongyuPhoto;
    }


    /**
	 * 获取：封面
	 */

    public void setRongyuPhoto(String rongyuPhoto) {
        this.rongyuPhoto = rongyuPhoto;
    }
    /**
	 * 设置：发布教师
	 */
    public Integer getJiaoshiId() {
        return jiaoshiId;
    }


    /**
	 * 获取：发布教师
	 */

    public void setJiaoshiId(Integer jiaoshiId) {
        this.jiaoshiId = jiaoshiId;
    }
    /**
	 * 设置：审核结果
	 */
    public Integer getRongyuYesnoTypes() {
        return rongyuYesnoTypes;
    }


    /**
	 * 获取：审核结果
	 */

    public void setRongyuYesnoTypes(Integer rongyuYesnoTypes) {
        this.rongyuYesnoTypes = rongyuYesnoTypes;
    }
    /**
	 * 设置：详情
	 */
    public String getRongyuContent() {
        return rongyuContent;
    }


    /**
	 * 获取：详情
	 */

    public void setRongyuContent(String rongyuContent) {
        this.rongyuContent = rongyuContent;
    }
    /**
	 * 设置：假删
	 */
    public Integer getRongyuDelete() {
        return rongyuDelete;
    }


    /**
	 * 获取：假删
	 */

    public void setRongyuDelete(Integer rongyuDelete) {
        this.rongyuDelete = rongyuDelete;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Rongyu{" +
            "id=" + id +
            ", rongyuName=" + rongyuName +
            ", rongyuTypes=" + rongyuTypes +
            ", rongyuPhoto=" + rongyuPhoto +
            ", jiaoshiId=" + jiaoshiId +
            ", rongyuYesnoTypes=" + rongyuYesnoTypes +
            ", rongyuContent=" + rongyuContent +
            ", rongyuDelete=" + rongyuDelete +
            ", createTime=" + createTime +
        "}";
    }
}
