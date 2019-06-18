package com.oujiajie.o2o.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @program: o2o
 * @description: 头条信息
 * @author: Mr.ou
 * @date: 2019-06-18 19:51
 **/
@Setter(value = AccessLevel.PUBLIC)
@Getter(value = AccessLevel.PUBLIC)
public class HeadLine {
    private Long lineId;
    private String lineName;
    private String lineLink;
    private String lineImg;
    private Integer priority;
    /**
     * 0.不可用 1.可用
     */
    private Integer enableStatus;
    private Date createTime;
    private Date lastEditTime;

}
