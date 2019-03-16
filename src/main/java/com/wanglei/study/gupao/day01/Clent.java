package com.wanglei.study.gupao.day01;

public class Clent {
    public static void main(String[] args)throws FactoryException {
        String type="json";
        String msg="{a:1}";
        String fmtid="fmt0000001";
        FmtFactory factory = new FmtFactory();
        Iexecutor iexecutor = factory.createExecutor(type);
        iexecutor.unpack(msg.getBytes(),fmtid);
    }
}
