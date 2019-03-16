package com.wanglei.study.gupao.day01;


/**
 * 解析器接口
 */
public interface Iexecutor {
    /**
     * 解包
     * @param message
     * @param fmtid
     */
    public void unpack(byte[] message,String fmtid);

    /**
     * 组包
     * @param context
     * @param fmtid
     */
    public void pack(Object context,String fmtid);
}
