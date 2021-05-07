package com.example.imooc.repository;

import com.example.imooc.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository repository;

    @Test
    public void saveTest() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("123457");
        productInfo.setProductName("beef");
        productInfo.setProductPrice(new BigDecimal(3.4));
        productInfo.setProductDescription("very good");
        productInfo.setProductStock(100);
        productInfo.setProductIcon("www.xxx.com");
        productInfo.setCategoryType(4);
        productInfo.setProductStatus(0);

        ProductInfo result = repository.save(productInfo);
        Assert.assertNotNull(result);



    }
    @Test
    public void findByProductId() {
        List<ProductInfo> productInfoList = repository.findByProductStatus(0);
        Assert.assertNotEquals(0, productInfoList.size());
    }
}