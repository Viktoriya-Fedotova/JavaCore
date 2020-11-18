package main.java.com.name.javacore.chapter07;

public class Outer {
    int outer_x = 100;

    void test() {

        Inner inner = new Inner();
        inner.display();
    }

    class Inner {  //Создаем внутренний класс
        void display() {
            System.out.println("Вывод outer_x = " + outer_x);
        }
    }
}

class InnerClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}