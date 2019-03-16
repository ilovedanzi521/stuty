package com.wanglei.study.gupao.day05.delegate;


public class Boss {
    public void command(String command,Leader leader){
        leader.doing(command);
    }
}
