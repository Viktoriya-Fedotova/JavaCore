package main.java.com.name.javacore.chapter08;

public class B extends A {
    int k;

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show(String msg) {
       // super.show(); //вызывает метод show() из суперкласса А, т.к. переопределенный метод show()
        System.out.println(msg + k); //в подклассе В перекрывает его из суперкласса
    }

    void sum() {
        System.out.println("i + j + k = " + (i + j + k));
    }
}
