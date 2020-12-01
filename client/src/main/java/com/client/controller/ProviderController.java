package com.client.controller;

import com.client.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    @Autowired
    private TestMapper testMapper;

    @RequestMapping(value = "/db")
    public String selectName(@RequestParam int Id) {
        return testMapper.selectName(Id);
    }
}