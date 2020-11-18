package main.java.com.name.javacore.chapter09;

public class MyIFimp implements MyIF {
    public int getNumber() {

        return 100;
    }
}

class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIFimp obj = new MyIFimp();

        System.out.println(obj.getNumber());

        System.out.println(obj.getString());
    }
}
