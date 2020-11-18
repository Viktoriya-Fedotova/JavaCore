package main.java.com.name.javacore.chapter18;
import java.util.*;
public class HTDemo2 {
    public static void main(String[] args) {
        Hashtable<String, Double> balance = new Hashtable<String, Double>();

        String str;
        Double bal;

        balance.put("Джoн Доу ", 3434.34);
        balance.put("Toм Смит ", 123.22);
        balance.put("Джейн Бейкер ", 1378.00);
        balance.put("Тод Халл ", 99.22);
        balance.put("Ральф Смит ", -19.08);

        //Вывести все счета в виде хеш-таблицы, предварительно представив их в виде множества
        Set<String> set = balance.keySet();

        //получить итератор
        Iterator<String> itr = set.iterator();

        while (itr.hasNext()) {
            str = itr.next();
            System.out.println(str + ": " + balance.get(str));
        }
        System.out.println();

        bal = balance.get("Тод Халл ");
        balance.put("Тод Халл ", bal + 1000);
        System.out.println("Новый остаток на счету Тод Халл: " + balance.get("Тод Халл "));


    }
}
