package com.cmb;

/**
 * @ProjectName: drool-stest
 * @Package: com.cmb
 * @ClassName: Order
 * @Author: 梁浩
 * @Description:
 * @Date: 2020/8/16 9:39
 * @Version: 1.0
 */



//订单

public class Order {

    private Double originlPrice; //订单的原始价格
    private Double realPrice; //优惠后的价格

    public Double getOriginlPrice() {
        return originlPrice;
    }

    public void setOriginlPrice(Double originlPrice) {
        this.originlPrice = originlPrice;
    }

    public Double getRealPrice() {
        return realPrice;
    }

    public void setRealPrice(Double realPrice) {
        this.realPrice = realPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "originlPrice=" + originlPrice +
                ", realPrice=" + realPrice +
                '}';
    }
}
