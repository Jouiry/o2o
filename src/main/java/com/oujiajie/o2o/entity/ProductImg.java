package com.oujiajie.o2o.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @program: o2o
 * @description: 图片信息
 * @author: Mr.ou
 * @date: 2019-06-18 20:04
 **/
@Setter(value = AccessLevel.PUBLIC)
@Getter(value = AccessLevel.PUBLIC)
public class ProductImg {
    private Long productImg;
    private String imgAddr;
    private String imgDesc;
    private Integer priority;
    private Date createTime;
    private Long productId;
}
