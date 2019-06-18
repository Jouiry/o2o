package com.oujiajie.o2o.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @program: o2o
 * @description: 用户信息
 * @author: Mr.ou
 * @date: 2019-06-18 16:52
 **/

@Getter(value = AccessLevel.PUBLIC)
@Setter(value = AccessLevel.PUBLIC)
public class PersonInfo {
    private Long userId;
    private String name;
    private String profileImg;
    private String email;
    private String gender;
    private Integer enableStatus;
    /**
     * 1.顾客 2.店家 3.超级管理员
     */
    private Integer userType;
    private Date createTime;
    private Date lastEditTime;


}
