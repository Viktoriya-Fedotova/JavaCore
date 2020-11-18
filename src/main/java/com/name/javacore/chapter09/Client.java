package main.java.com.name.javacore.chapter09;

public class Client implements CallBack {
    public void callback(int p) {
        System.out.println("Метод callback(), вызванный со значениме " + p);
    }
    void nonIfaceMeth() {
        System.out.println("В классах, реализующих интерфейсы " + "могут определяться и другие члены");
    }
}

class TestIface {
    public static void main(String[] args) {
        CallBack c = new Client(); //переменной "с" типа интерфеса присвоен экземпляр класса Client
        c.callback(42);
    }
}
