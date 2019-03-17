package com.wanglei.study.gupao.day06.template;


public  abstract class NetworkCourse {

    //1.
    //2
    //3
    //4
    //5提交源码
    //6.布置作业
    void createCourse(){
        if(needhomeJob()) {
            checkHomeJob();
        }
    }


    public  boolean needhomeJob(){
        return false;
    }

    public abstract void checkHomeJob();
}
