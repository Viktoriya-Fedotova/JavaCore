package main.java.com.name.javacore.chapter06;

public class Box1 {
    double wight;
    double height;
    double depth;

     Box1() {
         System.out.println("Конструирование обьекта Box1");
         wight = 11;
         height = 11;
         depth = 11;
}
    double volume () {
         return  wight * height * depth;
    }
}
