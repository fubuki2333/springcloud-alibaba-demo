package com.chenyu.springcloud.alibaba.domain;

import java.math.BigDecimal;

/**
 * ClassName: Order
 * Package: com.chenyu.springcloud.alibaba.domain
 * Description:
 *
 * @Date: 2021/9/2 下午 9:30
 * @Author: gaochenyu2012@126.com
 */
public class Order {

    private Long id;
    private Long userId;
    private long productId;
    private Integer count;
    private BigDecimal money;
    /**
     * //订单状态:  0:创建    1:已完成
     */
    private Integer status;

    public Order(Long id, Long userId, long productId, Integer count, BigDecimal money, Integer status) {
        this.id = id;
        this.userId = userId;
        this.productId = productId;
        this.count = count;
        this.money = money;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
