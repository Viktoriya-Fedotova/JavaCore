package main.java.com.name.javacore.chapter18;
import java.util.*;
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Double> hm = new HashMap<String, Double>();

        hm.put("John Dowh", new Double(3434.34));
        hm.put("Tom Smith", new Double(123.22));
        hm.put("Jane Baker", new Double(1378.00));
        hm.put("Tod Holl", new Double(99.22));
        hm.put("Ralph Smith", new Double(-19.08));

        //получить множество записей
        Set<Map.Entry<String, Double>> set = hm.entrySet();

        //вывести множество записей
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        //внести сумму 1000.00 на счет John Dowh
        double balance = hm.get("John Dowh");
        hm.put("John Dowh", balance + 1000);
        System.out.println("Новый остаток на счете John Dowh: " + hm.get("John Dowh"));





    }
}
