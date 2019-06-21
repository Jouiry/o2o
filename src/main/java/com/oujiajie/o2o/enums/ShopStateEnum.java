package com.oujiajie.o2o.enums;

import lombok.AccessLevel;
import lombok.Getter;

/**
 * @program: o2o
 * @description: 状态枚举
 * @author: Mr.ou
 * @date: 2019-06-21 14:44
 **/

@Getter(value = AccessLevel.PUBLIC)
public enum ShopStateEnum {
    CHECK(0,"审核中"),OFFLINE(-1,"非法店铺"),SUCCESS(1,"操作成功"),
    PASS(2,"通过认证"),INNER_ERROR(-1001,"内部系统错误"),
    NULL_SHOPID(-1002,"ShopId为空"),NULL_SHOP(-1003,"shop信息为空");

    private int state;
    private String stateInfo;

    private ShopStateEnum(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }

    public static ShopStateEnum stateof(int state) {
        for(ShopStateEnum stateEnum : values()) {
            if(stateEnum.getState() == state) {
                return stateEnum;
            }
        }
        return null;
    }


}
