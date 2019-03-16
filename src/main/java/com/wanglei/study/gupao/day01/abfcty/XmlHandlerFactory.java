package com.wanglei.study.gupao.day01.abfcty;

import com.wanglei.study.gupao.day01.Iexecutor;
import com.wanglei.study.gupao.day01.JsonExecutor;
import com.wanglei.study.gupao.day01.XmlExecutor;


/**
 * 产生xml报文交易链路工厂
 */
public  class XmlHandlerFactory extends HandlerFactory {
    /**
     * 获取解析器
     * @return
     */
    public  Iexecutor createExecutor(){
        return new XmlExecutor();
    };

    /**
     * 获取数据流水保存器
     * @return
     */
    public  IJnlSaver createSaver(){
        return new DbJnlSaver();
    };
}
