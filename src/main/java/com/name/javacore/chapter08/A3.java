package main.java.com.name.javacore.chapter08;

public abstract class A3 {
    abstract void callMe();

    void callMeToo() {
        System.out.println("Это конкретный метод");
    }
}

class B3 extends A3 {
    void callMe() {
        System.out.println("Реализация метода callMe() из класса В3");
    }
}

class AbstractDemo {
    public static void main(String[] args) {
        B3 b = new B3();

        b.callMe();
        b.callMeToo();
    }
}