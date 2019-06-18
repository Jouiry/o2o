package com.oujiajie.o2o.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @program: o2o
 * @description: 商店信息
 * @author: Mr.ou
 * @date: 2019-06-18 19:57
 **/
@Setter(value = AccessLevel.PUBLIC)
@Getter(value = AccessLevel.PUBLIC)
public class Shop {
    private Long shopId;
    private String shopName;
    private String shopDesc;
    private String phone;
    private String shopImg;
    private Integer priority;
    private Date createTime;
    private Date lastEditTime;
    /**
     * -1 不可用  0 审核中  1 可用
     */
    private Integer enableStatus;
    /**
     * 超级管理员给店家的提醒
     */
    private String advice;
    private Area area;
    private PersonInfo owner;
    private ShopCategory shopCategory;
}
