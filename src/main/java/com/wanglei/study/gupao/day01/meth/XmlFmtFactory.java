package com.wanglei.study.gupao.day01.meth;

import com.wanglei.study.gupao.day01.Iexecutor;
import com.wanglei.study.gupao.day01.XmlExecutor;

/**
 * xml解析器
 */
public class XmlFmtFactory extends  AbFmtFactory{
    @Override
    public Iexecutor createExecutor() {
        return new XmlExecutor();
    }
}
