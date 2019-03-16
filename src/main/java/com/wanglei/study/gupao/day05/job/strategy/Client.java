package com.wanglei.study.gupao.day05.job.strategy;

/**
 * 模拟客户汇款方式
 * 1.行内汇款
 * 2.跨行
 */
public class Client {
    public static void main(String[] args) {
        String type ="1";
        System.out.println(payment(type));

    }

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
