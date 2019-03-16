package com.wanglei.study.gupao.day02.test;

import com.wanglei.study.gupao.day02.destroy.HungrySingleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 *  测试单例被破坏
 */
public class HungrySingletonTest {
    /**代码结果：
     * com.wanglei.day02.destroy.HungrySingleton@1540e19d
     * com.wanglei.day02.destroy.HungrySingleton@677327b6
     * com.wanglei.day02.destroy.HungrySingleton@7ba4f24f
     * @param args
     */
    public static void main(String[] args) {
        try {
            /**
             * 如果代码不做限制，单例被破坏
             * 修改单例
             * if(hu != null){
             *             throw new RuntimeException("不能通过反射入侵");
             *         }
             * hu是final属性，不能被修改的特性,如果不设置final，构造器中的if可能失效
             */
            HungrySingleton hu = HungrySingleton.getInstance();
            Class cls = HungrySingleton.class;
            Constructor c = cls.getDeclaredConstructor(null);
            Field f = cls.getDeclaredFields()[0];//写死测试
            f.setAccessible(true);
            f.set(null,null);
            c.setAccessible(true);
            Object o1 = c.newInstance();
            System.out.println(hu);
            System.out.println(o1);

            /**
             * 序列化破坏单例
             *
             */
             // 使用objectoutputStream

            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos =  new ObjectOutputStream(bos);
            oos.writeObject(hu);
            oos.flush();
            oos.close();
            byte[] buff = bos.toByteArray();
            ObjectInputStream is = new ObjectInputStream(new ByteArrayInputStream(buff));
            Object o2 = is.readObject();
            is.close();
            System.out.println(o2);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
