package main.java.com.name.javacore.chapter18;

import java.util.*;

public class MyComp implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        String aStr, bStr;
        aStr = a;
        bStr = b;
        return bStr.compareTo(aStr); //выполнить сравнение в обратном порядке
    }
    //переопределять метод equals() не требуется
}

class CompDemo {
    public static void main(String[] args) {
        //create TreeSet

        TreeSet<String> ts = new TreeSet<String>(new MyComp());

        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        //вывести элементы из древовидного множества
        for (String element : ts)
        System.out.print(element + " ");
        System.out.println();
    }
}
