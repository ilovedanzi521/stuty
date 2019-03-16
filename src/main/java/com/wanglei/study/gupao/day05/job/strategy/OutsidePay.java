package com.wanglei.study.gupao.day05.job.strategy;

/**
 * 跨行转账
 */
public  class OutsidePay extends AbstractPay{
    @Override
    public Response pay(Request request) {
        Response response = new Response();
        response.code="KHEE";
        response.msg="跨行未支付";
        if(null!=request) {
            if (12.11==request.payamt){
                response.code="KH00";
                response.msg="支付成功";
            }else{
                response.code="KH01";
                response.msg="金额有误有误";
            }
        }else {
            response.code = "KH99";
            response.msg = "输入为空";
        }
        return response;
    }
}
