package main.java.com.name.javacore.chapter08;

public class Override {
    public static void main(String[] args) {
        B subOb = new B(1,2,3);
        subOb.show(); //этот метод из суперкласса А
        subOb.show("This is k: "); //этот метод из подкласса В
    }
}
