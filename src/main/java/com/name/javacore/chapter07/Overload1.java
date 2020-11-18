package main.java.com.name.javacore.chapter07;

public class Overload1 {
    public static void main(String[] args) {
        OverloadDemo1 od = new OverloadDemo1();
        int i = 88;

        od.test();
        od.test(10,20);

        od.test(i);
        od.test(123.25);
    }
}
