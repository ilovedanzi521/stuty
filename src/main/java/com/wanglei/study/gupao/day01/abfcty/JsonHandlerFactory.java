package com.wanglei.study.gupao.day01.abfcty;

import com.wanglei.study.gupao.day01.Iexecutor;
import com.wanglei.study.gupao.day01.JsonExecutor;


/**
 * 产生json报文交易链路工厂
 */
public  class JsonHandlerFactory extends HandlerFactory {
    /**
     * 获取解析器
     * @return
     */
    public  Iexecutor createExecutor(){
        return new JsonExecutor();
    };

    /**
     * redis 数据保存
     * @return
     */
    public  IJnlSaver createSaver(){
        return new RedisJnlSaver();
    };
}
