package com.wanglei.study.gupao.day03;


import java.io.*;
import java.util.Map;
import java.util.Set;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 该业务主要场景：
 * AppContext是业务场景进入平台构建的上下文，随着业务线程生和死
 * 在某些业务的流程中，比如出库、入库中，产生的变量可能并不需要加入到上下文中，但是出库、入库又必须使用之前的上下文变量
 * 所以需要clone一个context给出库、入库使用，等出库、入库结果后把之前的clone对象再赋值给context，
 * 防止出库、入库过程中篡改上下文context
 *
 *
 */
public class AppContext {
    Map<String,Object> scopeMap = new ConcurrentHashMap<String, Object>();

    public void add(String key,Object value){
        scopeMap.put(key,value);
    }

    public Object get(String key){
       return scopeMap.get(key);
    }

    public AppContext clone()  {
        AppContext appContext = new AppContext();
        Map<String, Object> map = this.scopeMap;
        //浅复制
        appContext.scopeMap.putAll(this.scopeMap);

        return appContext;
    }

    /**
     * 深复制
     * @return
     */
    public AppContext deepclone() {
        AppContext appContext = new AppContext();
        // 使用byte
        try {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(out);
            oos.writeObject(this.scopeMap);
            oos.flush();
            oos.close();

            ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(out.toByteArray()));
            Map<String, Object> o = (Map<String, Object>)in.readObject();
            in.close();

            appContext.scopeMap.putAll(o);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return appContext;
    }
}
