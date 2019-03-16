package com.wanglei.study.gupao.day05.strategy;

import java.util.HashMap;
import java.util.Map;

public class PromotionStategyFactory {

    private static Map<String,PromotionStrategy> PROMOTION_STATEGY_MAP = new HashMap<>();
    static {
        PROMOTION_STATEGY_MAP.put(PromotionKey.COPUU,new CashbackStrategy());

    }

    private static PromotionStrategy getPromotionStrategy(String promotionkey){


        return null;
    }

    private PromotionStategyFactory(){}

    private interface PromotionKey{
        String COPUU = "c";
    }
}
