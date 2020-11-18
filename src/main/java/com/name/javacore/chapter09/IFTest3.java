package main.java.com.name.javacore.chapter09;

public class IFTest3 {
    public static void main(String[] args) {
        IntStack mystck; //переменная ссылки на интерфейс
        DynStack ds = new DynStack(5);
        FixedStack fs = new FixedStack(8);

        mystck = ds;
        for (int i = 0; i < 12; i++) mystck.push(i);

        mystck = fs;
        for (int i = 0; i < 8; i++) mystck.push(i);

        mystck = ds;
        System.out.println("Значения в динамическом стеке: ");
        for (int i = 0; i < 12; i++)
            System.out.println(mystck.pop());

        mystck = fs;
        System.out.println("Значения в фиксированном стеке: ");
        for (int i = 0; i < 8; i++)
            System.out.println(mystck.pop());
    }
}
