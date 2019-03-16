package com.wanglei.study.gupao.day05.delegate;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class EmployeeA implements IEmployee{
    @Override
    public void doing(String command) {
        System.out.println("我是员工A，我开始干活，我加密");
    }
}
