package com.oujiajie.o2o.dto;

import com.oujiajie.o2o.entity.Shop;
import com.oujiajie.o2o.enums.ShopStateEnum;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @program: o2o
 * @description:
 * @author: Mr.ou
 * @date: 2019-06-21 14:41
 **/

@Getter(value = AccessLevel.PUBLIC)
@Setter(value = AccessLevel.PUBLIC)
public class ShopExecution {

    /**
     * 结果状态
     */
    private int state;
    /**
     * 状态标识
     */
    private String stateInfo;

    private int count;

    private Shop shop;

    private List<Shop> shopList;

    public ShopExecution(){

    }


    /**
    * @Description: 店铺操作失败时使用的构造器
    * @Param: [shopStateEnum]
    * @return:
    * @Date: 2019/6/21 0021
    */
    public ShopExecution(ShopStateEnum shopStateEnum){
        this.state = shopStateEnum.getState();
        this.stateInfo = shopStateEnum.getStateInfo();
    }

    /**
    * @Description:  店铺操作成功时使用的构造器
    * @Param: [shopStateEnum, shop]
    * @return:
    * @Date: 2019/6/21 0021
    */
    public ShopExecution(ShopStateEnum shopStateEnum, Shop shop){
        this.state = shopStateEnum.getState();
        this.stateInfo = shopStateEnum.getStateInfo();
        this.shop = shop;
    }

    public ShopExecution(ShopStateEnum shopStateEnum, List<Shop> shopList){
        this.state = shopStateEnum.getState();
        this.stateInfo = shopStateEnum.getStateInfo();
        this.shopList = shopList;
    }





}
