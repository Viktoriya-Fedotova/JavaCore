package main.java.com.name.javacore.chapter18;
import java.util.*;
public class ArraysDemo {
    public static void main(String[] args) {
        int [] array = new int[10];
        for (int i = 0; i < 10; i++)
            array[i] = -3 * i;

        //вывести, отсортировать и сново вывести содержимое массива
        System.out.print("Содержимое массива: ");
        display(array);
        Arrays.sort(array);
        System.out.print("Отсортированный массив: ");
        display(array);

        //заполнить массив и вывести его содержимое
        Arrays.fill(array, 2, 6, -1);
        System.out.print("Массив после вызова метода fill(): ");
        display(array);

        //отсортировать и вывести содержимое массива
        Arrays.sort(array);
        System.out.print("Массив после повторной сортировки: ");
        display(array);

        //выполнить двоичный поиск значения -9
        System.out.print("Значение -9 находится на позиции: ");
        int index = Arrays.binarySearch(array, -9);
        System.out.println(index);
        }

    private static void display(int[] array) {
        for (int i : array)
            System.out.print(i + " ");
        System.out.println();
    }
}

