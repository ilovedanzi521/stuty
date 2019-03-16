package com.wanglei.study.gupao.day02.destroy;

import java.io.Serializable;

/**
 * 饿汉式单例，模拟单例被破坏,
 * 分两种情况：1、反射；2、序列化
 *
 */
public class HungrySingleton implements Serializable {
    //1.私有构造器
    private HungrySingleton(){
        if(hu != null){
            throw new RuntimeException("不能通过反射入侵");
        }
    }
    //2.唯一访问点
    public static HungrySingleton getInstance(){
        return hu;
    }
    //3.初始化实例
    private static  HungrySingleton hu = new HungrySingleton();
}
