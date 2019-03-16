package com.wanglei.study.gupao.day01;


/**
 * json 报文解析器
 */
public class JsonExecutor implements Iexecutor{
    /**
     * 解包
     * @param message 报文
     * @param fmtid 格式转换id
     */
    public void unpack(byte[] message,String fmtid){
       System.out.println("json 解包");
   }

    /**
     * 组包
     * @param context 上下文
     * @param fmtid 组包id
     */
   public void pack(Object context,String fmtid){
       System.out.println("json 打包");
   }

}
