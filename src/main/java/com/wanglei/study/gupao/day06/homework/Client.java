package com.wanglei.study.gupao.day06.homework;

/**
 * @ClassName Client
 * @Description TODO
 * @Author yuman
 * @Date 2019/3/17 8:51
 * @菜鸡加油 run run run
 */
public class Client {
    public static void main(String[] args) {
        ChannelInserJnlSupport support =  new InsertJnlAdapter();
        support.insertABJnl(new MsgInterface());
    }
}
