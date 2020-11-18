package main.java.com.name.javacore.chapter07;

public class Box {
    double wight;
    double height;
    double depth;

    Box(double w, double h, double d) {
        wight = w;
        height = h;
        depth = d;
    }

    Box() {
        wight = -1; //-1 используется для неинициализированного куба
        height = -1;
        depth = -1;

    }

    Box(double len) { //конструктор, используемый при создании куба
        wight = height = depth = len;
    }

    double volume() {
        return wight * height * depth;
    }
}
