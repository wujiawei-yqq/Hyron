package com.client.controller;

import com.client.mapper.LianjiaMapper;
import com.pojo.lianjiaDao;
import entity.Result;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@RestController
@RequestMapping("/test")
@Api(value="Swagger 测试 Api")
public class ProviderController {

    @Autowired
    private LianjiaMapper lianjiaMapper;

    @GetMapping("/lianjia")
    public Result selectName(Model model) {
        Example example = new Example(lianjiaDao.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("id", 1);
        List<lianjiaDao> lianjiaList = lianjiaMapper.selectByExample(example);
        return Result.ok().data("lianjia",lianjiaList);
    }


    @GetMapping("/list/{page}/{limit}")
    public Result listPage(@ApiParam("当前页码") @PathVariable Long page,
                           @ApiParam("每页记录数") @PathVariable Long limit){
        return Result.ok();
    }
}