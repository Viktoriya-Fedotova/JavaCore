package main.java.com.name.javacore.chapter18;
import java.util.*;

public class CompLastNames implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        int i, j;

        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        return aStr.substring(i).compareTo(bStr.substring(j));
    }
}

class CompThenByFirstName implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        int i, j;

        return aStr.compareToIgnoreCase(bStr);
    }
}

class TreeMapDemo2A {
    public static void main(String[] args) {
        CompLastNames compLN = new CompLastNames();
        Comparator<String> compLastThenFirst = compLN.thenComparing(new CompThenByFirstName());

        TreeMap<String, Double> tm = new TreeMap<String, Double>(compLastThenFirst);

        tm.put("Джoн Доу ", new Double(3434.34));
        tm.put("Toм Смит ", new Double(123.22));
        tm.put("Джейн Бейкер ", new Double(1378.00));
        tm.put("Тод Халл ", new Double(99.22));
        tm.put("Ральф Смит ", new Double(-19.08));

        Set<Map.Entry<String, Double>> set = tm.entrySet();

        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        double balance = tm.get("Toм Смит ");
        tm.put("Toм Смит ", balance + 1000);
        System.out.println("Новый остаток на счете Тома Смита: " + tm.get("Toм Смит "));
    }
}
