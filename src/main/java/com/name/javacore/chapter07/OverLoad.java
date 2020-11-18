package main.java.com.name.javacore.chapter07;

public class OverLoad {
    public static void main(String[] args) {
        OverLoadDemo od = new OverLoadDemo();
        double result;

        od.test();
        od.test(10);
        od.test(10, 15);
        result = od.test(123.25);
        System.out.println("Результат вызова od.test(123.25) = " + result);
    }
}
