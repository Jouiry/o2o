package com.oujiajie.o2o.dao;

import com.oujiajie.o2o.entity.Shop;

/**
 * @program: o2o
 * @description:
 * @author: Mr.ou
 * @date: 2019-06-21 11:07
 **/

public interface ShopDao {
    
    /** 
    * @Description: 新增店铺 
    * @Param: [shop] 
    * @return: int  
    * @Date: 2019/6/21 0021 
    */
    int insertShop(Shop shop);
    
    /** 
    * @Description: 更新店铺 
    * @Param: [shop] 
    * @return: int  
    * @Date: 2019/6/21 0021 
    */
    int updateShop(Shop shop);
}
