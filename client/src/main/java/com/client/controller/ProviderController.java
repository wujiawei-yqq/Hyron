package com.client.controller;

import com.client.mapper.LianjiaMapper;
import com.pojo.lianjiaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Controller
@RequestMapping("/linajia")
public class ProviderController {

    @Autowired
    private LianjiaMapper lianjiaMapper;

    @GetMapping("/gulou")
    public String selectName(Model model) {
        Example example = new Example(lianjiaDao.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("id", 1);
        List<lianjiaDao> lianjiaList = lianjiaMapper.selectByExample(example);
        model.addAttribute("id", lianjiaList.get(0).getId());
        model.addAttribute("areaname", lianjiaList.get(0).getAreaname());
        model.addAttribute("urlchar", lianjiaList.get(0).getUrlchar());
        return "lianjia";
    }
}