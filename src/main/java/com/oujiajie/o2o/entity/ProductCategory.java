package com.oujiajie.o2o.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @program: o2o
 * @description: 商品类别
 * @author: Mr.ou
 * @date: 2019-06-18 20:02
 **/
@Setter(value = AccessLevel.PUBLIC)
@Getter(value = AccessLevel.PUBLIC)
public class ProductCategory {
    private Long productCategoryId;
    private Long shopId;
    private String productCategoryName;
    private Integer priority;
    private Date createTime;
}
