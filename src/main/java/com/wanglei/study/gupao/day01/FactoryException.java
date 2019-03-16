package com.wanglei.study.gupao.day01;

public class FactoryException extends  Exception {
    String msg;
    String code;
    public FactoryException(String msg,String code){
        this.msg = msg;
        this.code = code;
    }
}
