package com.oujiajie.o2o.service;

import com.oujiajie.o2o.dto.ShopExecution;
import com.oujiajie.o2o.entity.Shop;
import com.oujiajie.o2o.exceptions.ShopOperationException;

import java.io.File;
import java.io.InputStream;

/**
 * @program: o2o
 * @description:
 * @anthor: Mr.ou
 * @date: 2019-06-21 14:58
 **/

public interface ShopService {
    ShopExecution addShop(Shop shop, InputStream shopImgInputStream, String fileName) throws ShopOperationException;
}
