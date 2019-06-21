package com.oujiajie.o2o.service;

import com.oujiajie.o2o.BaseTest;
import com.oujiajie.o2o.dto.ShopExecution;
import com.oujiajie.o2o.entity.Area;
import com.oujiajie.o2o.entity.PersonInfo;
import com.oujiajie.o2o.entity.Shop;
import com.oujiajie.o2o.entity.ShopCategory;
import com.oujiajie.o2o.enums.ShopStateEnum;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * @program: o2o
 * @description:
 * @author: Mr.ou
 * @date: 2019-06-21 16:14
 **/

public class ShopServiceTest extends BaseTest {

    @Autowired
    private ShopService shopService;

    @Test
    public void testAInsertShop() throws Exception {
        Shop shop = new Shop();
        PersonInfo personInfo = new PersonInfo();
        Area area = new Area();
        ShopCategory shopCategory = new ShopCategory();
        personInfo.setUserId(8L);
        area.setAreaId(3);
        shopCategory.setShopCategoryId(14L);
        shop.setOwner(personInfo);
        shop.setArea(area);
        shop.setShopCategory(shopCategory);
        shop.setShopName("测试的店铺");
        shop.setShopDesc("test");
        shop.setShopAddr("test");
        shop.setPhone("test");
        shop.setShopImg("test");
        shop.setCreateTime(new Date());
        shop.setLastEditTime(new Date());
        shop.setEnableStatus(ShopStateEnum.CHECK.getState());
        shop.setAdvice("审核中");
        File shopImg = new File("D:\\picture\\ma.png");
        InputStream inputStream = new FileInputStream(shopImg);
        ShopExecution se = shopService.addShop(shop, inputStream, shopImg.getName());
        assertEquals(ShopStateEnum.CHECK.getState(),se.getState());
    }

}
