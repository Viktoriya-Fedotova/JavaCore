package main.java.com.name.javacore.chapter03;

public class Area {
    public static void main(String[] args) {
        double pi, r, a;

        r = 12.5;  //инициализируем переменную r (радиус окружности)
        pi = 3.1416; //инициализируем переменную pi (значение числа Пи)
        a = pi*r*r; //динамическая инициализация переменной а

        System.out.println("Площадь круга равна " + a);
    }
}
