package main.java.com.name.javacore.chapter09;

public class FixedStack implements IntStack {
    private int stck[];
    private int tos;

    FixedStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    public void push(int item) {
        if (tos == stck.length-1)
            System.out.println("Стек заполнен!");
        else
            stck[++tos] = item;
    }

    public int pop() {
        if (tos < 0) {
            System.out.println("Стек не загружен!");
            return 0;
        }
        else
            return stck[tos--];
    }
}

class IFTest {
    public static void main(String[] args) {
        FixedStack mystck1 = new FixedStack(6);
        FixedStack mystck2 = new FixedStack(8);

        //разместить числа в стеке

        for (int i = 0; i < 6; i++) mystck1.push(i);
        for (int i = 0; i < 8; i++) mystck2.push(i);

        //извлечь эти числа из стека

        System.out.println("Числа в стеке mystck1: ");
        for (int i = 0; i < 6; i++)
        System.out.println(mystck1.pop());

        System.out.println("Числа в стеке mystck2: ");
        for (int i = 0; i < 8; i++)
        System.out.println(mystck2.pop());

    }
}
