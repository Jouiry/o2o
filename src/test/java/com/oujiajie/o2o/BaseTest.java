package com.oujiajie.o2o;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @program: o2o
 * @description: 基类测试
 * @author: Mr.ou
 * @date: 2019-06-19 15:53
 **/

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml",
        "classpath:spring/spring-service.xml" })
public class BaseTest {

}
