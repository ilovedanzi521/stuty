package com.wanglei.study.gupao.day05.strategy;

public class CashbackStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println(" 返现");
    }
}
