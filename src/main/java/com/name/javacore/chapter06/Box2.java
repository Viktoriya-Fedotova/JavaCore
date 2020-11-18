package main.java.com.name.javacore.chapter06;

public class Box2 {
    double wight;
    double height;
    double depth;

    Box2(double w, double h, double d) {
        wight = w;
        height = h;
        depth = d;
    }
    double volume () {
        return  wight * height * depth;
    }
}
