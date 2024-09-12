package com.yupi.courseManage.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yupi.courseManage.common.BaseResponse;
import com.yupi.courseManage.common.ResultUtils;
import com.yupi.courseManage.model.domain.Collect;
import com.yupi.courseManage.service.CollectService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/collect")
public class CollectController {
    @Resource
    private CollectService collectService;

    @GetMapping("/search")
    public BaseResponse<List<Collect>> searchCollect(String collect){

        QueryWrapper<Collect> queryWrapper = new QueryWrapper<>();
        if (StringUtils.isNotBlank(collect)){
            queryWrapper.like("collect",collect);
        }
        List<Collect> courseList = collectService.list(queryWrapper);
        return ResultUtils.success(courseList);
    }
}
