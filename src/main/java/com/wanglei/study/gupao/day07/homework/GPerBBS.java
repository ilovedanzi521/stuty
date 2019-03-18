package com.wanglei.study.gupao.day07.homework;

import com.google.common.eventbus.EventBus;

/**
 * @ClassName GPerBBS
 * @Description TODO
 * @Author yuman
 * @Date 2019/3/18 19:32
 * @菜鸡加油 run run run
 */
public class GPerBBS {
    private static EventBus eventBus=  new EventBus();
    private GPerBBS(){

    }
    public static EventBus getInstance(){
        return eventBus;
    }
    public static void register(Object object){
        eventBus.register(object);
    }

    public static void unregist(Object object){
        eventBus.unregister(object);
    }
    public  static void post(Object object){
        eventBus.post(object);
    }
}
