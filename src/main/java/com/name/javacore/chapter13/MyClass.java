package main.java.com.name.javacore.chapter13;

import java.util.Arrays;

public class MyClass {
    int a;
    int b;

    MyClass(int i, int j) {
        a = i;
        b = j;
    }

  /*  MyClass(int i) {
        a = i;
        b = i;
    }

    MyClass() {
        a = 0;
        b = 0;
    } */

    MyClass(int i) {
        this(i, i);
    }

    MyClass() {
        this(0);
    }
}

class MyClassTest {
    public static void main(String[] args) {
        MyClass mc = new MyClass();
        System.out.println(mc.a);
        System.out.println(mc.b);
        System.out.println();

        MyClass mC = new MyClass(8);
        System.out.println(mc.a);
        System.out.println(mc.b);
    }
}