package com.baomidou.ant.admin.controller;


import com.baomidou.ant.admin.entity.UserInfo;
import com.baomidou.ant.admin.service.IUserInfoService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import entity.Result;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wjw
 * @since 2020-12-07
 */
@RestController
@RequestMapping("/admin/user-info")
public class UserInfoController{
    @Autowired
    IUserInfoService iUserInfoService;

    @GetMapping("/list/{page}/{limit}")
    public Result listPage(@ApiParam("当前页码") @PathVariable Long page,
                           @ApiParam("每页记录数") @PathVariable Long limit){
        Page<UserInfo> pageParm = new Page<>(page,limit);
        IPage<UserInfo> pageModel = iUserInfoService.page(pageParm);
        List<UserInfo> records = pageModel.getRecords();
        long total = pageModel.getTotal();
        return Result.ok().data("total",total).data("rows",records);
    }
}
