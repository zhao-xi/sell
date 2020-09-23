package com.imooc.repository;

import com.imooc.dataobject.OrderDetail;
import junit.framework.TestCase;
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
public class OrderDetailRepositoryTest extends TestCase {
    @Autowired
    private OrderDetailRepository repository;

    @Test
    public void testSave() {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("112233");
        orderDetail.setOrderId("123456");
        orderDetail.setProductIcon("http://xxxx.jpg");
        orderDetail.setProductName("皮蛋粥");
        orderDetail.setProductPrice(new BigDecimal(10));
        orderDetail.setProductId("123456");
        orderDetail.setProductQuantity(1);

        repository.save(orderDetail);
    }

    @Test
    public void testFindByOrderId() {
        List<OrderDetail> result = repository.findByOrderId("123456");
        Assert.assertNotEquals(0, result.size());
    }
}