package com.wanglei.study.gupao.day01.meth;

public class Client1 {
    public static void main(String[] args) {
        String type="json";
        String msg="{a:1}";
        String fmtid="fmt0000001";
        AbFmtFactory factory = new JsonFmtFactory();
        factory.createExecutor().unpack(msg.getBytes(),fmtid);
    }
}
