package com.oujiajie.o2o.exceptions;

/**
 * @program: o2o
 * @description: 店铺异常
 * @author: Mr.ou
 * @date: 2019-06-21 15:10
 **/

public class ShopOperationException extends RuntimeException {

//    private static final long serialVersionUID =

    public ShopOperationException(String message) {
        super(message);
    }
}
