package com.wanglei.study.gupao.day05.strategy;

public class PromotionActivity {

    PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy){
        this.promotionStrategy = promotionStrategy;
    }

    public void execute(){
       promotionStrategy.doPromotion();
    }

}
