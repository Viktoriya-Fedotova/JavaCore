package main.java.com.name.javacore.chapter06;



public class Stack {
    int stck[] = new int[10];
    int tos;

    Stack() {
        tos = -1;  //инициализация вершины стека
    }

    //расположить элемент в стеке
    void push(int item) {
        if (tos == 9)
            System.out.println("Стек заполнен!");
        else
            stck[++tos] = item;
    }

    //извлечь элемент из стека
    int pop() {
        if (tos < 0) {
            System.out.println("Стек не загружен");
            return 0;
        } else return stck[tos--];
    }
}
