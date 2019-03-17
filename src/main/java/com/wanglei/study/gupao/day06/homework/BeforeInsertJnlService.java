package com.wanglei.study.gupao.day06.homework;

/**
 * @ClassName Service
 * @Description  重构前的代码
 * @Author yuman
 * @Date 2019/3/17 7:46
 * @菜鸡加油 run run run
 */
public class BeforeInsertJnlService {
    /**
     * 最开始的内部流水插入
     * @param msg
     */
    public void insertJnl(MsgInterface msg){
        System.out.println("插入流水");
    }

    /**
     *模拟插入柜面流水，需要给字段赋值
     * @param msg
     */
    public void insertABJnl(MsgInterface msg){
        msg.setStd400va("1111111");
        System.out.println("插入柜面流水");
    }

    /**
     * 模拟插入网银流水，需要给字段赋值
     * @param msg
     */
    public void insertWYJnl(MsgInterface msg){
        msg.setStd400trk("12223");
        System.out.println("插入网银流水");
    }
}
