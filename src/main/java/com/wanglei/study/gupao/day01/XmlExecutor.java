package com.wanglei.study.gupao.day01;


/**
 * xml解析器
 */
public class XmlExecutor implements  Iexecutor{
    /**
     * 解包
     * @param message 报文
     * @param fmtid 格式转换id
     */
    public void unpack(byte[] message,String fmtid){
        System.out.println("xml 解包");
    }

    /**
     * 组包
     * @param context 上下文
     * @param fmtid 组包id
     */
    public void pack(Object context,String fmtid){
        System.out.println("xml 打包");
    }

}
