/*
 * Baijiahulian.com Inc. Copyright (c) 2014-2019 All Rights Reserved.
 */

package com.alibaba.druid.springdemo.web;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.druid.springdemo.entity.Example;
import com.alibaba.druid.springdemo.mapper.ExampleMapper;

/**
 * @author Kongjianfu
 * @date 2021/11/16
 */
@RestController
@RequestMapping("api")
public class WebController {

    @Resource
    ExampleMapper exampleMapper;

    @GetMapping("example/{id}")
    public Example example(@PathVariable long id) {
        return exampleMapper.selectById(id);
    }

}
