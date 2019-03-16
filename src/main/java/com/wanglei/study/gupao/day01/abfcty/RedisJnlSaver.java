package com.wanglei.study.gupao.day01.abfcty;

/**
 * redis保存
 */
public class RedisJnlSaver implements IJnlSaver {
    @Override
    public void save(String msg) {
        System.out.println("msg 保存到redis中");
    }
}
