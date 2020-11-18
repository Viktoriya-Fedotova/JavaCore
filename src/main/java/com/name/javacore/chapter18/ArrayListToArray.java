package main.java.com.name.javacore.chapter18;

import java.util.*;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<Integer>();

        //добавить эелементы в списочный массив
        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);

        System.out.println("Содержимое списочного массива а1: " + a1);

        //получить обычный массив
        Integer [] ia = new Integer[a1.size()]; /*назначаем в обычном массиве ia количество элементов как размер
        списочного массива а1 */
        ia = a1.toArray(ia); //преобразовываем списочный массив a1 в обычный массив и сохраняем в массиве ia

        int sum = 0;

        for (int i : ia) sum += i;

        System.out.println("Сумма = " + sum);




    }
}
