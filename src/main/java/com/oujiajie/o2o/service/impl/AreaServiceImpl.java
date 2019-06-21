package com.oujiajie.o2o.service.impl;

import com.oujiajie.o2o.dao.AreaDao;
import com.oujiajie.o2o.entity.Area;
import com.oujiajie.o2o.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: o2o
 * @description:
 * @author: Mr.ou
 * @date: 2019-06-19 16:14
 **/

@Transactional
@Service
public class AreaServiceImpl implements AreaService {
    @Autowired
    private AreaDao areaDao;


    @Override
    public List<Area> getAreaList() {
        return areaDao.queryArea();
    }
}
