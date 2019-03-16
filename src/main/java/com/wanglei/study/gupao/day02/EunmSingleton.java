package com.wanglei.study.gupao.day02;


public enum EunmSingleton {
    WORK(new WorkThread(1)),TASK(new TaskThread(2));

    private ThreadPool threadPool;
    private EunmSingleton(ThreadPool threadPool){
        this.threadPool = threadPool;
    };

    public ThreadPool getThreadPool(){
        return threadPool;
    }
}
