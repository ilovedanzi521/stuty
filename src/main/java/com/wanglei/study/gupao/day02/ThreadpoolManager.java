package com.wanglei.study.gupao.day02;

public class ThreadpoolManager {

    public static ThreadpoolManager getInstance() {
        return ThreadType.WORK.getInstance();
    }

    enum ThreadType {
        WORK;
        private ThreadpoolManager threadpoolManager;

        ThreadType() {
            threadpoolManager = new ThreadpoolManager();

        }

        private ThreadpoolManager getInstance() {
            return threadpoolManager;
        }
    }



}
