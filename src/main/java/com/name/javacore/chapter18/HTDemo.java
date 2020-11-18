package main.java.com.name.javacore.chapter18;
import java.util.*;
public class HTDemo {
    public static void main(String[] args) {
        Hashtable<String, Double> balance = new Hashtable<String, Double>();
        Enumeration<String> names;

        String str;
        Double bal;

        balance.put("Джoн Доу ", 3434.34);
        balance.put("Toм Смит ", 123.22);
        balance.put("Джейн Бейкер ", 1378.00);
        balance.put("Тод Халл ", 99.22);
        balance.put("Ральф Смит ", -19.08);

        //показать все счета в хеш-таблице
        names = balance.keys();
        while (names.hasMoreElements()) {
            str = names.nextElement();
            System.out.println(str + ": " + balance.get(str));
        }
        System.out.println();

        //внести сумму 1000 на счет Джейн Бейкер
        bal = balance.get("Джейн Бейкер ");
        balance.put("Джейн Бейкер ", bal + 1000);
        System.out.println("Новый остаток на счете Джейн Бейкер: " + balance.get("Джейн Бейкер "));
    }
}
