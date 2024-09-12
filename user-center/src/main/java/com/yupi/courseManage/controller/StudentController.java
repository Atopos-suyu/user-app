package com.yupi.courseManage.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yupi.courseManage.common.BaseResponse;
import com.yupi.courseManage.common.ResultUtils;
import com.yupi.courseManage.model.domain.Student;
import com.yupi.courseManage.service.StudentService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Resource
    private StudentService studentService;

    @GetMapping("/search")
    public BaseResponse<List<Student>> searchStudent(String student){

        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        if (StringUtils.isNotBlank(student)){
            queryWrapper.like("student",student);
        }
        List<Student> studentList = studentService.list(queryWrapper);
        return ResultUtils.success(studentList);
    }
}
