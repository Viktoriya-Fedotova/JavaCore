package main.java.com.name.javacore.chapter08;

public class SimpleInheritance {
    public static void main(String[] args) {
        A superOb = new A(1,2);
        B subOb = new B(1,2,3);

        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Содержимое обьекта superOb: ");
        superOb.show();
        System.out.println();

        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("Содержимое обьекта subOb: ");
        subOb.show();

        System.out.println();
        System.out.println("Сумма i, j, k в обьекте subOb: ");
        subOb.sum();

    }

}
