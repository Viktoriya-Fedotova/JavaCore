package main.java.com.name.javacore.chapter18;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hs = new LinkedHashSet<String>(); //создается хеш-множество

        //добавление обьектов в хеш-множество
        hs.add("Бэта");
        hs.add("Альфа");
        hs.add("Эта");
        hs.add("Гамма");
        hs.add("Эпсилон");
        hs.add("Омега");

        System.out.println(hs);

    }
}
