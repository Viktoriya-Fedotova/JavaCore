package main.java.com.name.javacore.chapter18;
import java.util.*;
public class PropDemoDef {
    public static void main(String[] args) {
        Properties defList = new Properties();
        defList.put("Флорида", "Телесси");
        defList.put("Висконсин", "Мэдисон");

        Properties capital = new Properties(defList);
        capital.put("Иллинойс", "Спрингфилд");
        capital.put("Миссури", "Джефферсон-Сити");
        capital.put("Вашингтон", "Олимпия");
        capital.put("Калифорния", "Сакраменто");
        capital.put("Индиана", "Индианаполис");

        Set<?> states = capital.keySet();

        for (Object name : states)
            System.out.println("Столица штата: " + name + " - " + capital.getProperty((String)name) + ".");
        System.out.println();

        String str = capital.getProperty("Флорида");
        System.out.println("Столица шатата Флорида: " + str + ".");
    }
}
