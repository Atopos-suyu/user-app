package com.yupi.courseManage.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yupi.courseManage.common.BaseResponse;
import com.yupi.courseManage.common.ResultUtils;
import com.yupi.courseManage.model.domain.Course;
import com.yupi.courseManage.service.CourseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {
    @Resource
    private CourseService courseService;

    @GetMapping("/search")
    public BaseResponse<List<Course>> searchCourse(String course){

        QueryWrapper<Course> queryWrapper = new QueryWrapper<>();
        if (StringUtils.isNotBlank(course)){
            queryWrapper.like("course",course);
        }
        List<Course> courseList = courseService.list(queryWrapper);
        return ResultUtils.success(courseList);
    }
}
