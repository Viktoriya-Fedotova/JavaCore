package main.java.com.name.javacore.chapter07;

public class RecTest {
    int values[]; //обьявление массива values

    RecTest (int i) { //конструктор с параметром i

        values = new int[i]; //выделение памяти для данных массива
    }

    void printArray(int i) { //вывести рекурсивно элементы массива
        if (i == 0) return;
        else printArray(i - 1);
        System.out.println("[" + (i - 1) + "] " + values[i - 1]);
    }
}

class Recursion2 {
    public static void main(String[] args) {
        RecTest ob = new RecTest(10);
        int i;

        for (i = 0; i <10; i++) ob.values[i] = i;
        ob.printArray(10);

    }
}
