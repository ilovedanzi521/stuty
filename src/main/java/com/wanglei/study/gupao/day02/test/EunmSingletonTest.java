package com.wanglei.study.gupao.day02.test;


import com.wanglei.study.gupao.day02.EunmSingleton;

/**
 * test
 */
public class EunmSingletonTest {
    public static void main(String[] args) {
        new Thread(new newThread(),"thread1").start();
        new Thread(new newThread(), "thread2").start();
    }


}

class newThread implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+ EunmSingleton.WORK.getThreadPool());
    }
}
