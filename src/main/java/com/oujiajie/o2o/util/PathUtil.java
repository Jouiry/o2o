package com.oujiajie.o2o.util;

/**
 * @program: o2o
 * @description:
 * @author: Mr.ou
 * @date: 2019-06-21 12:31
 **/

public class PathUtil {

    private static String seperator = System.getProperty("file.separator");

    public static String getImagePath() {
        String os = System.getProperty("os.name");
        String basePath = "";
        if(os.toLowerCase().startsWith("win")) {
            basePath = "D:/picture/image/";
        } else {
            basePath = "/home/oujiajie/image/";
        }
        basePath = basePath.replace("/",seperator);
        return basePath;
    }

    public static String getShopimagePath(long shopId) {
        String imagePath = "upload/item/shop/" + shopId + "/";
        return imagePath.replace("/",seperator);
    }
}
