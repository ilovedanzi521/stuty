package com.wanglei.study.gupao.day05.job.strategy;

/**
 * 响应
 */
public class Response {
    String code;
    String msg;

    @Override
    public String toString() {
        return " 支付返回码"+code+"支付信息"+msg;
    }
}
