package com.oujiajie.o2o.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @program: o2o
 * @description: 微信账号
 * @author: Mr.ou
 * @date: 2019-06-18 17:17
 **/

@Getter(value = AccessLevel.PUBLIC)
@Setter(value = AccessLevel.PUBLIC)
public class WechatAuth {
    private Long wechatAuthId;
    private String openId;
    private Date createTime;
    private PersonInfo personInfo;

}
