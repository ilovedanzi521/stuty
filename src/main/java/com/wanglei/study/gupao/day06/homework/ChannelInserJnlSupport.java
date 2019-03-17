package com.wanglei.study.gupao.day06.homework;

/**
 * @ClassName ReconsitutionService
 * @Description  第三方流水插入接口
 * @Author yuman
 * @Date 2019/3/17 8:31
 * @菜鸡加油 run run run
 */
public interface ChannelInserJnlSupport {
    /**
     * 柜面流水插入接口
     * @param msg
     */
    public void insertABJnl(MsgInterface msg);

    /**
     * 网银流水插入接口
     * @param msg
     */
    public void insertWYJnl(MsgInterface msg);
}
