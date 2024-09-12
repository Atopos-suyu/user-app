package com.yupi.courseManage.model.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 成绩单表
 * @TableName collect
 */
@TableName(value ="collect")
@Data
public class Collect implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 学号
     */
    private String studentID;

    /**
     * 课程编号
     */
    private String courseID;

    /**
     * 学期 
     */
    private String semester;

    /**
     * 成绩
     */
    private String score;

    /**
     * 任课教师编号
     */
    private String teacherID;

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
     * 院系
     */
    private String department;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}