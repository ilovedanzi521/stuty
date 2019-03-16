package com.wanglei.study.gupao.day05.delegate;

public class EmployeeB implements IEmployee{
    @Override
    public void doing(String command)
    {
        System.out.println("我是员工B，我开始干活，我架构");
    }
}
