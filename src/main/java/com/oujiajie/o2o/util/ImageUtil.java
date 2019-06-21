package com.oujiajie.o2o.util;


import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Position;
import net.coobird.thumbnailator.geometry.Positions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;


/**
 * @program: o2o
 * @description: 图片处理
 * @author: Mr.ou
 * @date: 2019-06-21 11:48
 **/

public class ImageUtil {
    private static Logger logger = LoggerFactory.getLogger(ImageUtil.class);
    private static String basePath = Thread.currentThread().getContextClassLoader().getResource("").getPath().substring(1);
    private static final SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
    private static final Random r = new Random();
    public static String generateThumbail(InputStream thumbnailInputStream,String fileName, String targetAddr) {
        String realFileName = getRandomFileName();
        String extension = getFileExtention(fileName);
        makeDirPath(targetAddr);
        String relativeAddr = targetAddr + realFileName + extension;
        logger.debug("current relativeAddr is:" + relativeAddr);
        File dest = new File(PathUtil.getImagePath() + relativeAddr);
        logger.debug("cerrent complete addr is:" + PathUtil.getImagePath() + relativeAddr);
        try{
            Thumbnails.of(thumbnailInputStream).size(200,200)
                    .watermark(Positions.BOTTOM_RIGHT, ImageIO.read(new File(basePath+"watermark.png")),0.9f).outputQuality(0.8f)
                    .toFile(dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return relativeAddr;
    }

    /**
    * @Description: 创建目标路径所涉及到的目录
    * @Param: [targetAddr]
    * @return: void
    * @Date: 2019/6/21 0021
    */
    private static void makeDirPath(String targetAddr) {
        String realFileParentPath = PathUtil.getImagePath() + targetAddr;
        File dirPath = new File(realFileParentPath);
        if(!dirPath.exists()) {
            dirPath.mkdirs();
        }
    }

    /**
    * @Description: 获取输入文件流的扩展名
    * @Param: [thumbnail]
    * @return: java.lang.String
    * @Date: 2019/6/21 0021
    */
    private static String getFileExtention(String fileName) {
        return fileName.substring(fileName.lastIndexOf("."));
    }


    /**
    * @Description: 生成随机文件名，当前年月日小时分钟秒+五位随机数
    * @Param: []
    * @return: java.lang.String
    * @Date: 2019/6/21 0021
    */
    private static String getRandomFileName() {
        int rannum = r.nextInt(89999) + 10000;
        String nowTimeStr = sDateFormat.format(new Date());
        return nowTimeStr + rannum;
    }


    public static void main(String[] args) throws IOException {

        System.out.println(basePath);
        Thumbnails.of(new File("D:\\picture\\s.jpg")).size(200,200)
                .watermark(Positions.BOTTOM_RIGHT, ImageIO.read(new File(basePath+"watermark.png")),0.9f).outputQuality(0.8f)
                .toFile("D:\\picture\\baisenew.jpg");
    }
}
