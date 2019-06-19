package com.oujiajie.o2o.dao;

import com.oujiajie.o2o.BaseTest;
import com.oujiajie.o2o.entity.Area;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.Assert.assertEquals;

import java.util.List;

/**
 * @program: o2o
 * @description: 区域dao测试
 * @author: Mr.ou
 * @date: 2019-06-19 15:55
 **/

public class AreaDaoTest extends BaseTest {
    @Autowired
    private AreaDao areaDao;

    @Test
    public void testQueryArea(){
        List<Area> areaList = areaDao.queryArea();
        assertEquals(4,areaList.size());
    }
}
