package main.java.com.name.javacore.chapter09;

public class MyClass implements Bb {
    public void meth1() {
        System.out.println("Реализация метода meth1()");
    }

    public void meth2() {
        System.out.println("Реализация метода meth2()");
    }

    public void meth3() {
        System.out.println("Реализация метода meth3()");
    }
}

class IfExtend {
    public static void main(String[] args) {
        MyClass ob = new MyClass();

        ob.meth1();
        ob.meth2();
        ob.meth3();
    }
}
