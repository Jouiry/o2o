package com.oujiajie.o2o.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @program: o2o
 * @description: 店铺类别
 * @author: Mr.ou
 * @date: 2019-06-18 19:54
 **/

@Setter(value = AccessLevel.PUBLIC)
@Getter(value = AccessLevel.PUBLIC)
public class ShopCategory {
    private Long shopCategoryId;
    private String shopCategoryName;
    private String shopCategoryDesc;
    private String shopCategoryImg;
    private Integer priority;
    private Date createTime;
    private Date lastEditTime;
    private ShopCategory parent;
}
