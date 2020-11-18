package main.java.com.name.javacore.chapter08;

public class A1 {
    A1() {
        System.out.println("В конструткоре А1");
    }
}
class B1 extends A1 {
    B1() {
        System.out.println("В конструткоре B1");
    }
}
class C1 extends B1 {
    C1() {
        System.out.println("В конструткоре C1");
    }
}

class CallingCons {
    public static void main(String[] args) {
        C1 c = new C1();

    }
}