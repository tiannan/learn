package com.tian.annote;

import java.lang.reflect.Type;

/**
 * create by txm  on 2020/7/10
 * desc
 */

class Test {
    public static void main(String[] args) {

        Type type1 = new MyTestClass<Test1>().getType();
        System.out.println(type1);

        Type type2 = new MyTestClass2().getType();
        System.out.println(type2);

    }


}
