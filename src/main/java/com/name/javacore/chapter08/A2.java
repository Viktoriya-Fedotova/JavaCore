package main.java.com.name.javacore.chapter08;

public class A2 {
    void callMe() {
    }
}

class B2 extends A2{
    void callMe() {
        System.out.println("Реализация метода callMe() из класса B");
    }
}

class C2 extends A2 {
    void callMe() {
        System.out.println("В методе callMe() из класса C");
    }
}

class Dispatch {
    public static void main(String[] args) {
        A2 a = new A2();
        B2 b = new B2();
        C2 c = new C2();

        A2 r; //получить ссылку на обьект типа А

        r = a; //переменная r ссылается на обьект типа А2
        r.callMe(); //вызвать метод callMe() из класса А2

        r = b; //переменная r ссылается на обьект типа B2
        r.callMe(); //вызвать метод callMe() из класса B2

        r = c; //переменная r ссылается на обьект типа C2
        r.callMe(); //вызвать метод callMe() из класса C2
    }
}
