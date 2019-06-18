package com.oujiajie.o2o.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @program: o2o
 * @description: 本地账号
 * @author: Mr.ou
 * @date: 2019-06-18 17:19
 **/

@Setter(value = AccessLevel.PUBLIC)
@Getter(value = AccessLevel.PUBLIC)
public class LocalAuth {
    private Long localAuthId;
    private String username;
    private String password;
    private Date createTime;
    private Date lastEditTime;
    private PersonInfo personInfo;
}
