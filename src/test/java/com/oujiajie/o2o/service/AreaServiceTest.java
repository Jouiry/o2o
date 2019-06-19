package com.oujiajie.o2o.service;

import com.oujiajie.o2o.BaseTest;
import com.oujiajie.o2o.entity.Area;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.Assert.assertEquals;
import java.util.List;

/**
 * @program: o2o
 * @description:
 * @author: Mr.ou
 * @date: 2019-06-19 16:18
 **/

public class AreaServiceTest extends BaseTest {

    @Autowired
    private AreaService areaService;

    @Test
    public void AreaServiceTest(){
        List<Area> areaList = areaService.getAreaList();
        assertEquals(4,areaList.size());
    }
}
