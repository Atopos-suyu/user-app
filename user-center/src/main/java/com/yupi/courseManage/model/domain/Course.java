package com.yupi.courseManage.model.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 课程表
 * @TableName course
 */
@TableName(value ="course")
@Data
public class Course implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 课程号
     */
    private String courseID;

    /**
     * 课程名称
     */
    private String courseName;

    /**
     * 学分 
     */
    private Integer credits;

    /**
     * 课程类型
     */
    private String courseType;

    /**
     * 上课地点
     */
    private String location;

    /**
     * 活跃-0 已取消-1
     */
    private Integer courseStatus;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 
     */
    private Date updateTime;

    /**
     * 是否删除
     */
    @TableLogic
    private Integer isDelete;

    /**
     * 用户角色 0 - 普通用户 1 - 管理员
     */
    private Integer userRole;

    /**
     * 星球编号
     */
    private String planetCode;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}