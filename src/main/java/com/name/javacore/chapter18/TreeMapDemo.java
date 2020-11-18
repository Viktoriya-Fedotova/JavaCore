package main.java.com.name.javacore.chapter18;
import java.util.*;
public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, Double> tm = new TreeMap<String, Double>();

        tm.put("John Dowh", new Double(3434.34));
        tm.put("Tom Smith", new Double(123.22));
        tm.put("Jane Baker", new Double(1378.00));
        tm.put("Tod Holl", new Double(99.22));
        tm.put("Ralph Smith", new Double(-19.08));

        //получить множество записей
        Set<Map.Entry<String, Double>> set = tm.entrySet();

        //вывести множество записей
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        //внести сумму 1000.00 на счет John Dowh
        double balance = tm.get("John Dowh");
        tm.put("John Dowh", balance + 1000);
        System.out.println("Новый остаток на счете John Dowh: " + tm.get("John Dowh"));
    }
}
