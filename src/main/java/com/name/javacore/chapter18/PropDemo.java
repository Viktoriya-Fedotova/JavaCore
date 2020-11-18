package main.java.com.name.javacore.chapter18;
import java.util.*;
public class PropDemo {
    public static void main(String[] args) {
        Properties capital = new Properties();

        capital.put("Иллинойс", "Спрингфилд");
        capital.put("Миссури", "Джефферсон-Сити");
        capital.put("Вашингтон", "Олимпия");
        capital.put("Калифорния", "Сакраменто");
        capital.put("Индиана", "Индианаполис");

        //получить множество ключей
        Set<?> states = capital.keySet();

        //показать все штаты и их столицы
        for (Object name : states)
            System.out.println("Столица штата " + name + " - " + capital.getProperty((String)name) + ".");
        System.out.println();

        //найти штат, отсутствующий в списке, указав значения, выбираемые по умолчанию
        String str = capital.getProperty("Флорида", "не найдена");
        System.out.println("Столица шатата Флорида: " + str + ".");

    }
}
