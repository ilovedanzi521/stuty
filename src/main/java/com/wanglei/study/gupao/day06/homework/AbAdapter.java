package com.wanglei.study.gupao.day06.homework;

/**
 * @ClassName AbAdapter
 * @Description 实现柜面流水插入
 * @Author yuman
 * @Date 2019/3/17 8:27
 * @菜鸡加油 run run run
 */
public class AbAdapter implements Adapters{
    @Override
    public void insertJnl(MsgInterface msg) {
        System.out.println("柜面流水插入");
    }
}
