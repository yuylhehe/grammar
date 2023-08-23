package org.example;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Objects;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    static class A {
        private String a;

        public A() {
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            A a1 = (A) o;
            return Objects.equals(a, a1.a);
        }

        @Override
        public int hashCode() {
            return Objects.hash(a);
        }
    }

    public static void main(String[] args) {
        A a = new A();
        int aHashCode = a.hashCode();
        System.out.println(aHashCode);

        HashMap<String, String> map = new HashMap<>();
        map.put("王锦", "小可爱");
        map.put("与瑶磊", "帅哥");
        map.containsKey("王锦");
    }
}