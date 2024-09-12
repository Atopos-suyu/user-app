package com.yupi.courseManage.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yupi.courseManage.Mapper.CourseMapper;
import com.yupi.courseManage.model.domain.Course;
import com.yupi.courseManage.service.CourseService;
import org.springframework.stereotype.Service;

/**
* @author suyu
* @description 针对表【course(课程表)】的数据库操作Service实现
* @createDate 2024-07-02 16:54:49
*/
@Service
public class CourseServiceImpl extends ServiceImpl<CourseMapper, Course>
    implements CourseService {

}




