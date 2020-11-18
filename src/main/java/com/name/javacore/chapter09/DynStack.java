package main.java.com.name.javacore.chapter09;

import com.sun.deploy.security.SelectableSecurityManager;

public class DynStack implements IntStack {
    private int stck[];
    private int tos;

    //выделить память и инициализировать стек
    DynStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    public void push(int item) {
        //если стек заполнен, выделить память под стек большего размера
        if (tos == stck.length - 1) {
            int temp[] = new int[stck.length * 2]; //удвоить размер стека
            for (int i = 0; i < stck.length; i++) temp[i] = stck[i]; //непонятен смысл строчки
            stck = temp; //непонятен смысл строчки
            stck[++tos] = item; //непонятен смысл строчки
        }
    }

    public int pop() {
        if (tos < 0) {
            System.out.println("Стек не загружен!");
            return 0;
        } else
            return stck[tos--];
    }
}

class IFTest2 {
    public static void main(String[] args) {
        DynStack mystck1 = new DynStack(5);
        DynStack mystck2 = new DynStack(9);

        for (int i = 0; i < 12; i++) mystck1.push(i);
        for (int i = 0; i < 20; i++) mystck2.push(i);

        System.out.println("Стек в mystck1: ");
        for (int i = 0; i < 12; i++)
            System.out.println(mystck1.pop());

        System.out.println("Стек в mystck2: ");
        for (int i = 0; i < 20; i++)
            System.out.println(mystck2.pop());
    }
}
