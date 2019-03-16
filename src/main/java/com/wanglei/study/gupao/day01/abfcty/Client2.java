package com.wanglei.study.gupao.day01.abfcty;

import com.wanglei.study.gupao.day01.meth.AbFmtFactory;
import com.wanglei.study.gupao.day01.meth.JsonFmtFactory;

public class Client2 {
    public static void main(String[] args) {
        String type="json";
        String msg="{a:1}";
        String fmtid="fmt0000001";
        HandlerFactory factory = new JsonHandlerFactory();
        factory.createExecutor().unpack(msg.getBytes(),fmtid);
        factory.createSaver().save(msg);
    }
}
