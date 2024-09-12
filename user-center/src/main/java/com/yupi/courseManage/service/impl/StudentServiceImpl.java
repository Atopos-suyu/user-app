package com.yupi.courseManage.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yupi.courseManage.Mapper.StudentMapper;
import com.yupi.courseManage.model.domain.Student;
import com.yupi.courseManage.service.StudentService;
import org.springframework.stereotype.Service;

/**
* @author suyu
* @description 针对表【student(学生管理表)】的数据库操作Service实现
* @createDate 2024-07-03 11:18:39
*/
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student>
    implements StudentService {

}




