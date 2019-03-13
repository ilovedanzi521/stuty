package com.wanglei.study.gupao.day04.myproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Meipo implements MyInvocationHandler {

    private Object people;

    public Object  getinstance(Object people){
        this.people = people;
        Class<?> cls = people.getClass();
        //生成代理类java
        return  MyProxy.newProxyInstance(new MyClassLoader(),cls.getInterfaces(),this);

    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object object = method.invoke(this.people,args);
        after();
        return null;
    }

    private void before(){
        System.out.println("欢迎小伙子来个**媒婆中心");
    }

    private void after(){
        System.out.println("恭喜小伙子了啊");
    }
}
