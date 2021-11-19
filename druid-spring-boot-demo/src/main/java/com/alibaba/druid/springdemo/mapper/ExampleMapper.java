/*
 * Baijiahulian.com Inc. Copyright (c) 2014-2019 All Rights Reserved.
 */

package com.alibaba.druid.springdemo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.alibaba.druid.springdemo.entity.Example;

/**
 * @author Kongjianfu
 * @date 2021/11/16
 */
@Mapper
public interface ExampleMapper {

    Example selectById(Long id);

}
