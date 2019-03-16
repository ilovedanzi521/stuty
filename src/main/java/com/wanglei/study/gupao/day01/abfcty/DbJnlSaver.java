package com.wanglei.study.gupao.day01.abfcty;

/**
 * db 保存
 */
public class DbJnlSaver implements  IJnlSaver{
    @Override
    public void save(String msg) {
        System.out.println("msg 保存到数据库中");
    }
}
