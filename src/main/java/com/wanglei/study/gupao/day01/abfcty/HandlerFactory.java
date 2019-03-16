package com.wanglei.study.gupao.day01.abfcty;

import com.wanglei.study.gupao.day01.Iexecutor;

/**
 * 产生交易链路工厂
 */
public abstract  class HandlerFactory {
    /**
     * 获取解析器
     * @return
     */
    public abstract Iexecutor createExecutor();

    public abstract IJnlSaver createSaver();
}
