package com.oujiajie.o2o.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @program: o2o
 * @description: 区域信息
 * @author: Mr.ou
 * @date: 2019-06-18 16:56
 **/

@Setter(value = AccessLevel.PUBLIC)
@Getter(value = AccessLevel.PUBLIC)
public class Area {
    /**
     * ID
     */
    private Integer areaId;
    /**
     *名称
     */
    private String areaName;
    /**
     * 权重
     */
    private Integer priority;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date lastEditTime;
}
