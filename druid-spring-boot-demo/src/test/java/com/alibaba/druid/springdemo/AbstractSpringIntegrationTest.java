/*
 * Baijiahulian.com Inc. Copyright (c) 2014-2019 All Rights Reserved.
 */

package com.alibaba.druid.springdemo;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Kongjianfu
 * @date 2021/11/16
 */
//@ActiveProfiles("h2")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringdemoApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
                properties = "spring.autoconfigure.exclude=org.springframework.boot.actuate.autoconfigure.jdbc.DataSourceHealthContributorAutoConfiguration")
public abstract class AbstractSpringIntegrationTest {

}
