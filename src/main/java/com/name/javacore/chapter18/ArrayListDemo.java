package main.java.com.name.javacore.chapter18;
import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<String>(); //создание списочного массива с элементами типа String
        System.out.println("Начальная длина списочного массива a1: " + a1.size());

        //добавляем элементы в списочный массив

        a1.add("C");
        a1.add("A");
        a1.add("E");
        a1.add("B");
        a1.add("D");
        a1.add("F");
        a1.add(1, "A2");

        System.out.println("Размер списочного массива a1 после добавления в него элементов: " + a1.size());
        System.out.println("Содержимое списочного массива а1: " + a1);

        //удаляем элементы из списочного массива

        a1.remove("F");
        a1.remove(2);

        System.out.println("Размер списочного массива после удаления элементов: " + a1.size());
        System.out.println("Содержимое списочного массива а1:" + a1);
    }
}
