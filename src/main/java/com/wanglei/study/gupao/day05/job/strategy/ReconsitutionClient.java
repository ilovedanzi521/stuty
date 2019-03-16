package com.wanglei.study.gupao.day05.job.strategy;

/**
 * 重构client
 */
public class ReconsitutionClient {
    public static void main(String[] args) {
        //1.测试枚举单例
      AbstractPay pay1 =  PayFactory.getPay("1");
        AbstractPay pay2=  PayFactory.getPay("1");
        //2。调用
        System.out.println(pay1.pay(new Request()));

    }

    /**
     * 该方法可舍弃
     * @param type
     * @return
     */
    private static Response payment(String type) {
        Response rtn = new Response();
        if("1".equals(type)){
            rtn = new InsidePay().pay(new Request());
        }else if("2".equals(type)){
            rtn = new OutsidePay().pay(new Request());
        }else{
            rtn.msg="支付方式有误";
            rtn.code="9999";
        }
        return rtn;
    }
}
