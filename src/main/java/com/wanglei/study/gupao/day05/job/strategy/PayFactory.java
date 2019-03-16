package com.wanglei.study.gupao.day05.job.strategy;

public enum PayFactory {
    INSIDE_PAY("1",new InsidePay()),OUTSIDE_PAY("2",new OutsidePay());


    private String type;
    private AbstractPay value;

    PayFactory(String type,AbstractPay value){
        this.type =type;
        this.value = value;
    }
    private PayFactory(){};

    public static AbstractPay getPay(String type){
        AbstractPay payment = null;
        PayFactory [] pays = PayFactory.values();
        for (PayFactory pay: pays) {
          if(type.equals(pay.getType())){
              payment= pay.getValue();
          }
        }
        return payment;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public AbstractPay getValue() {
        return value;
    }

    public void setValue(AbstractPay value) {
        this.value = value;
    }

}
