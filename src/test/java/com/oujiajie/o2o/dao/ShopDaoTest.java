package com.oujiajie.o2o.dao;


import com.oujiajie.o2o.BaseTest;
import com.oujiajie.o2o.entity.Area;
import com.oujiajie.o2o.entity.PersonInfo;
import com.oujiajie.o2o.entity.Shop;
import com.oujiajie.o2o.entity.ShopCategory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

import static org.junit.Assert.assertEquals;




public class ShopDaoTest extends BaseTest {
	@Autowired
	private ShopDao shopDao;

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
		shop.setEnableStatus(1);
		shop.setAdvice("审核中");
		int i = shopDao.insertShop(shop);
		assertEquals(1,i);
	}

    @Test
    public void testUpdateShop() throws Exception {
        Shop shop = new Shop();
        shop.setShopId(31L);
        shop.setShopDesc("测试描述");
        shop.setShopAddr("测试地址");
        int i = shopDao.updateShop(shop);
        assertEquals(1,i);
    }



}
