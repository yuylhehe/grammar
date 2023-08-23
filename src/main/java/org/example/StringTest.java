package org.example;

import java.util.HashMap;

public class StringTest {
    public static final String finalStr = "qwer";
    public static final A a = null;
    public static void main(String[] args) {

        // 无法赋值
        // finalStr = "111l";

        A a1 = new A();
        // 对象无法改变引用，但是可以修改
        // a = a1;
        a.setA("11");
        a.setA("11");

        final String str1 = "str";
        final String str2 = getStr();
        String c = "str" + "ing";// 常量池中的对象
        String d = str1 + str2; // 在堆上创建的新的对象
        System.out.println(c == d);
    }
    public static String getStr() {
        return "ing";
    }
    static class A {
        public A() {
        }

        private String a;
        private String b;

        public void setA(String a) {
            this.a = a;
        }

        public void setB(String b) {
            this.b = b;
        }
    }
}
