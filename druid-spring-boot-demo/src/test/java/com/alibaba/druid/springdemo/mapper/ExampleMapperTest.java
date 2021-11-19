/*
 * Baijiahulian.com Inc. Copyright (c) 2014-2019 All Rights Reserved.
 */

package com.alibaba.druid.springdemo.mapper;

import static org.junit.Assert.assertEquals;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;

import com.alibaba.druid.springdemo.AbstractSpringIntegrationTest;
import com.alibaba.druid.springdemo.entity.Example;

/**
 * @author Kongjianfu
 * @date 2021/11/16
 */
public class ExampleMapperTest extends AbstractSpringIntegrationTest {

    @Resource
    private ExampleMapper exampleMapper;

    @Before
    public void before() {
//        int count = exampleMapper.insert(example);
//        assertEquals(1, count);
    }

    @Test
    public void testSelectById() {
        Example example = exampleMapper.selectById(1L);
        assertEquals(1, example.getId());
    }

}
