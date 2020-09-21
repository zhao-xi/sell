package com.imooc.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Data
public class ProductInfo {
    /* 商品id */
    @Id
    private String productId;

    /* 商品名 */
    private String productName;

    /* 商品价格 */
    private BigDecimal productPrice;

    /* 商品库存 */
    private Integer productStock;

    /* 商品描述 */
    private String productDescription;

    /* 商品小图url */
    private String productIcon;

    /* 商品状态,0正常,1下架 */
    private Integer productStatus;

    /* 商品类目 */
    private Integer categoryType;
}
