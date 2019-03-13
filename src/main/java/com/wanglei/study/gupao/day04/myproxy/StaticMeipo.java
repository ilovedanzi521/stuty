package com.wanglei.study.gupao.day04.myproxy;


import java.lang.reflect.Method;

public class StaticMeipo implements People {
    MyInvocationHandler handler;
    public StaticMeipo(MyInvocationHandler handler){
        this.handler = handler;
    }
    public void findLover() {
        try {
            Method method = People.class.getMethod("findLover", new Class[]{});
            handler.invoke(this,method,null );
        }catch (Throwable e){
            e.printStackTrace();
        }
    }
}
