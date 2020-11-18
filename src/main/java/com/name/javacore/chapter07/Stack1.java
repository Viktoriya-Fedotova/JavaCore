package main.java.com.name.javacore.chapter07;

public class Stack1 {
    private int stck[];
    private int tos;

    //выделение памяти под стэк и его инициализация
    Stack1(int size) { //конструктор
        stck = new int[size];
        tos = -1;
    }

    //разместить элемент в стэке
    void push(int item) {
        if (tos == stck.length-1)
            System.out.println("Стэк заполнен!");
        else
            stck[++tos] = item;
    }

    //извлечь элементы из стэка

    int pop() {
        if (tos < 0) {
            System.out.println("Стэк не загружен");
            return 0;
        } else
            return stck[tos--];
    }
}

class TestStack1 {
    public static void main(String[] args) {
        Stack1 mystack1 = new Stack1(5);
        Stack1 mystack2 = new Stack1(8);

        for (int i = 0; i < 5; i++) mystack1.push(i);
        for (int i = 0; i < 8; i++) mystack2.push(i);

        System.out.println("Стек в mystack1");
        for (int i = 0; i < 5; i++)
           System.out.println(mystack1.pop());

        System.out.println("Стек в mystack2");
        for (int i = 0; i < 8; i++)
            System.out.println(mystack2.pop());
    }
}

