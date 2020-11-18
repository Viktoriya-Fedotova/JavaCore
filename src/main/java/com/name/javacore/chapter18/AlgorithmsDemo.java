package main.java.com.name.javacore.chapter18;
import java.util.*;

public class AlgorithmsDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(-8);
        ll.add(20);
        ll.add(-20);
        ll.add(8);

        //Создать компаратор с обратным упорядочиванием
        Comparator<Integer> r = Collections.reverseOrder();

        //отсортировать список с помощью этого компаратора
        Collections.sort(ll, r);

        System.out.println("Список отсортирован в обратном порядке: ");
        for (int i : ll)
            System.out.print(i + " ");
        System.out.println();

        //перетосовать список
        Collections.shuffle(ll);

        //вывести перетасованный список
        System.out.print("Перетасованный список: ");
        for (int i : ll)
            System.out.print(i + " ");
        System.out.println();

        System.out.println("Минимальное значение: " + Collections.min(ll));
        System.out.println("Максимальное значение: " + Collections.max(ll));
    }
}
