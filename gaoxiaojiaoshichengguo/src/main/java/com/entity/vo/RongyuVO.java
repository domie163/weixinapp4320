package com.entity.vo;

import com.entity.RongyuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 荣誉信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("rongyu")
public class RongyuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
