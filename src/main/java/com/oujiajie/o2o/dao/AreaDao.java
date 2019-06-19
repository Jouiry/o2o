package com.oujiajie.o2o.dao;

import com.oujiajie.o2o.entity.Area;

import java.util.List;

/**
 * @program: o2o
 * @description: 区域Dao
 * @anthor: Mr.ou
 * @date: 2019-06-19 15:44
 **/

public interface AreaDao {
    /**
    * @Description:  列出区域列表
    * @Param: []
    * @return: java.util.List<com.oujiajie.o2o.entity.Area>
    * @Date: 2019/6/19 0019
    */
    List<Area> queryArea();
}
