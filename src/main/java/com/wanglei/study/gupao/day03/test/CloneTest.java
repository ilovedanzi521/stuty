package com.wanglei.study.gupao.day03.test;

import com.wanglei.study.gupao.day03.AppContext;
import com.wanglei.study.gupao.day03.Man;

public class CloneTest {
    public static void main(String[] args) {
        Man man = new Man();
        AppContext context = new AppContext();
        context.add("man",man);
        System.out.println(context.get("man"));

        AppContext tmpContext = context.clone();
        System.out.println(tmpContext.get("man"));

        tmpContext = context.deepclone();
        System.out.println(tmpContext.get("man"));
        //测试结果
      /*  com.wanglei.study.gupao.day03.Man@4554617c
        com.wanglei.study.gupao.day03.Man@4554617c
        com.wanglei.study.gupao.day03.Man@5e9f23b4*/

        /**
         * 实际业务中不推荐使用深复制，实体类必须实现Serializable
         */
    }
}
