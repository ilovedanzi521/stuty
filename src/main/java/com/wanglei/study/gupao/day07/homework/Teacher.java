package com.wanglei.study.gupao.day07.homework;

import com.google.common.eventbus.Subscribe;

/**
 * @ClassName Teacher
 * @Description TODO
 * @Author yuman
 * @Date 2019/3/18 19:33
 * @菜鸡加油 run run run
 */
public class Teacher {
    @Subscribe
    public void answer(Question question){
        System.out.println("你好！同学："+question.getUsername()+",你的问题"+question.getContent()+"的答案是:"+"呵呵");
    }
}
