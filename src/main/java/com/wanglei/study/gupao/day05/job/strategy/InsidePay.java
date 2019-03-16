package com.wanglei.study.gupao.day05.job.strategy;

/**
 * 行内转账
 */
public class InsidePay extends AbstractPay{
    @Override
    public Response pay(Request request) {
        Response response = new Response();
        response.code="HNEE";
        response.msg="未支付";
        if(null!=request) {
            if ("12345".equals(request.acno)){
                response.code="HN00";
                response.msg="支付成功";
            }else{
                response.code="HN01";
                response.msg="帐号输入有误";
            }
        }else {
            response.code = "HN99";
            response.msg = "输入为空";
        }
        return response;
    }
}
