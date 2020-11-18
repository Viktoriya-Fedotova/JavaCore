package main.java.com.name.javacore.chapter09;

import main.java.com.name.javacore.chapter08.A;

public class AnotherClient implements CallBack {
    public void callback(int p) {
        System.out.println("Еще один вариант метода callback()");
        System.out.println("р в квадрате = " + p * p);
    }
}

class TestIface2 {
    public static void main(String[] args) {
        CallBack c = new Client();
        AnotherClient ob = new AnotherClient();

        c.callback(42);
        c = ob;

        c.callback(42);
    }
}
