package com.oujiajie.o2o.service.impl;

        import com.oujiajie.o2o.dao.ShopDao;
        import com.oujiajie.o2o.dto.ShopExecution;
        import com.oujiajie.o2o.entity.Shop;
        import com.oujiajie.o2o.enums.ShopStateEnum;
        import com.oujiajie.o2o.exceptions.ShopOperationException;
        import com.oujiajie.o2o.service.ShopService;
        import com.oujiajie.o2o.util.ImageUtil;
        import com.oujiajie.o2o.util.PathUtil;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;
        import org.springframework.transaction.annotation.Transactional;

        import java.io.InputStream;
        import java.util.Date;

/**
 * @program: o2o
 * @description:
 * @author: Mr.ou
 * @date: 2019-06-21 14:59
 **/

@Service
@Transactional
public class ShopServiceImpl implements ShopService {

    @Autowired
    private ShopDao shopDao;


    @Override
    public ShopExecution addShop(Shop shop, InputStream shopImgInputStream, String fileName) {
        if(shop == null) {
            return new ShopExecution(ShopStateEnum.NULL_SHOP);
        }
        try{
            shop.setEnableStatus(0);
            shop.setCreateTime(new Date());
            shop.setLastEditTime(new Date());
            int effctedNum = shopDao.insertShop(shop);
            if(effctedNum <= 0) {
                throw new ShopOperationException("店铺创建失败!");
            } else {
                if (shopImgInputStream != null) {
                    //存储图片
                    try {
                        addShopImg(shop, shopImgInputStream,fileName);
                    } catch (Exception e) {
                        throw new ShopOperationException("addShopImg Error: " + e.getMessage());
                    }
                    effctedNum = shopDao.updateShop(shop);
                    if (effctedNum <= 0) {
                        throw new ShopOperationException("更新图片地址失败!");
                    }
                }
            }
        } catch (Exception e) {
            throw new ShopOperationException("addShop Error: " + e.getMessage());
        }
        return new ShopExecution(ShopStateEnum.CHECK,shop);
    }

    private void addShopImg(Shop shop, InputStream shopImgInputStream, String fileName) {
        String dest = PathUtil.getShopimagePath(shop.getShopId());
        String shopImgAddr = ImageUtil.generateThumbail(shopImgInputStream,fileName,dest);
        shop.setShopImg(shopImgAddr);
    }
}
