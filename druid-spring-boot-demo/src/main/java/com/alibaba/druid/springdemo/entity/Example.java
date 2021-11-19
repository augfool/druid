/*
 * Baijiahulian.com Inc. Copyright (c) 2014-2019 All Rights Reserved.
 */

package com.alibaba.druid.springdemo.entity;

import java.sql.Timestamp;

import lombok.Data;

/**
 * @author Kongjianfu
 * @date 2021/11/16
 */
@Data
public class Example {

    private long id;

    private String exampleNumber;

    private String name;

    private String profile;

    private Timestamp createTime;

    private Timestamp updateTime;

}
