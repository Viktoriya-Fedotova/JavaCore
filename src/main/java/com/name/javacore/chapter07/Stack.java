package main.java.com.name.javacore.chapter07;

public class Stack {
    private int stck[] = new int[10];
    private int tos;

    Stack() {
        tos = -1; //инициализация вершины стэка
    }

    //разместить элементы в стэке
    void push(int item) {
        if (tos == 9)
            System.out.println("Стэк заполнен");
        else
            stck[++tos] = item;
    }

    //извлечь элементы из стэка
    int pop() {
        if (tos < 0) {
            System.out.println("Стэк не загружен");
            return 0;
        } else return stck[tos--];
    }

}

class TestStack {
    public static void main(String[] args) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        for (int i = 0; i < 10; i++) mystack1.push(i); //размещение обьектов в стэке
        for (int i = 10; i < 20; i++) mystack2.push(i); //размещение обьектов в стэке

        //извлечь числа из стэка
        System.out.println("Стэк в mystack1: ");
        for (int i = 0; i < 10; i++)
            System.out.println(mystack1.pop());

        System.out.println("Стэк в mystack2: ");
        for (int i = 0; i < 10; i++)
            System.out.println(mystack2.pop());
    }
}