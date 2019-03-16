package com.wanglei.study.gupao.day01.meth;

import com.wanglei.study.gupao.day01.Iexecutor;
import com.wanglei.study.gupao.day01.JsonExecutor;

/**
 * json 解析器
 */
public class JsonFmtFactory extends AbFmtFactory{
    @Override
    public Iexecutor createExecutor() {
        return new JsonExecutor();
    }
}
