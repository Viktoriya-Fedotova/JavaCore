package main.java.com.name.javacore.chapter02;

public class IfSample {
    public static void main(String[] args) {
        int x, y;  //Обьявляем переменные x,y, которые имеют тип данных int

        x = 10; // присваиваем переменной значение 10
        y = 20; // присваиваем переменной значение 20

        if (x < y)  System.out.println("x меньше y");

        x = x*2;
        if (x == y) System.out.println("x теперь равно y");

        x = x*2;
        if (x > y) System.out.println("x теперь больше y");

        if (x==y)  System.out.println("вы теперь увидите это");

    }
}
