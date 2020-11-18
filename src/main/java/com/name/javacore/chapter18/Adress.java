package main.java.com.name.javacore.chapter18;
import java.util.*;

public class Adress {
    private String name;
    private String street;
    private String city;
    private String state;
    private String code;

    Adress(String n, String s, String ct, String st, String c) {
        name = n;
        street = s;
        city = ct;
        state = st;
        code = c;
    }

    @Override
    public String toString() {
        return  name + "\n" +
                street + "\n" +
                city + " " +
                state + " " +
                code;
    }
}

class MailList {
    public static void main(String[] args) {
        LinkedList<Adress> ml = new LinkedList<Adress>();

        //ввести элементы в связный список
        ml.add(new Adress("J.W. West", "11 Oak Ave", "Urbana", "IL", "61801"));
        ml.add(new Adress("Ralph Baker", "1142 Maple Lane", "Mahomet", "IL", "61853"));
        ml.add(new Adress("Tom Carlton", "867 Elm St", "Champaign", "IL", "61820"));

        for (Adress element : ml)
            System.out.println(element + "\n");

        System.out.println();
    }
}
