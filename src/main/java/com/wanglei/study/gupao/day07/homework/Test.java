package com.wanglei.study.gupao.day07.homework;

/**
 * @ClassName Test
 * @Description TODO
 * @Author yuman
 * @Date 2019/3/18 19:44
 * @菜鸡加油 run run run
 */
public class Test {
    public static void main(String[] args) {

        Question question = new Question();
        question.setUsername("caiji");
        question.setContent("怎么学java");
        Teacher t = new Teacher();
        //@teacher
        GPerBBS.register(t);
        //提交问题
        GPerBBS.post(question);
    }
}
