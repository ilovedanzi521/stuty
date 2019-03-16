package com.wanglei.study.gupao.day01.meth;

import com.wanglei.study.gupao.day01.FactoryException;
import com.wanglei.study.gupao.day01.Iexecutor;
import com.wanglei.study.gupao.day01.JsonExecutor;
import com.wanglei.study.gupao.day01.XmlExecutor;

/**
 * 报文解析器
 */
public abstract  class AbFmtFactory {
    /**
     * 获取解析器
     * @return
     */
    public abstract Iexecutor createExecutor();
}
