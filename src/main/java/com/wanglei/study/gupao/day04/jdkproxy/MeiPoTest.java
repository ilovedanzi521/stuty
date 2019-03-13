package com.wanglei.study.gupao.day04.jdkproxy;

public class MeiPoTest {
    public static void main(String[] args) {
        People people = (People) new Meipo().getinstance(new DanshenPeople());
        people.findLover();

    }
}
