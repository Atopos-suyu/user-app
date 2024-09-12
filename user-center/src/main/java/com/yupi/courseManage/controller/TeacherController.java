package com.yupi.courseManage.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yupi.courseManage.common.BaseResponse;
import com.yupi.courseManage.common.ResultUtils;
import com.yupi.courseManage.model.domain.Teacher;
import com.yupi.courseManage.service.TeacherService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Resource
    private TeacherService teacherService;

    @GetMapping("/search")
    public BaseResponse<List<Teacher>> SearchTeacher(String teacher){

        QueryWrapper<Teacher> queryWrapper = new QueryWrapper<>();
        if (StringUtils.isNotBlank(teacher)){
            queryWrapper.like("teacher",teacher);
        }
        List<Teacher> teacherList = teacherService.list(queryWrapper);
        return ResultUtils.success(teacherList);
    }
}
