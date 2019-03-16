package com.wanglei.study.gupao.day05.strategy;

/**
 * 无优惠
 */
public class EmptyStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("无促销的活动");
    }
}
