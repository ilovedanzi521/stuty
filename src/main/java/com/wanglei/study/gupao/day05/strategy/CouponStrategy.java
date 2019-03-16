package com.wanglei.study.gupao.day05.strategy;

public class CouponStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("领取优惠券，课程的价格直接减去优惠卷的价格");
    }
}
