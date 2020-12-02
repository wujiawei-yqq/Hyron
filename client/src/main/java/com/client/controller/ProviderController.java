package com.client.controller;

import com.client.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/t")
public class ProviderController {

    @Autowired
    private TestMapper testMapper;

    @RequestMapping(value = "/db")
    public String selectName(@RequestParam int Id) {
        return testMapper.selectName(Id);
    }

    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("ss","东方嘉盛分类考试了");
        return "Hello"; //当浏览器输入/index时，会返回 /templates/home.html页面
    }
}