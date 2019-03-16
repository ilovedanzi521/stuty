package com.wanglei.study.gupao.day01;


public class FmtFactory {

    public Iexecutor createExecutor(String type) throws FactoryException{
        if("xml".equals(type)){
            return new XmlExecutor();
        }else if("json".equals(type)){
            return new JsonExecutor();
        }else {
            throw new FactoryException("NOT TYPE", "9999");
        }
    }
}
