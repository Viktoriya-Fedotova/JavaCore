package main.java.com.name.javacore.chapter07;

public class Box1 {
    double wight;
    double height;
    double depth;

    Box1(Box1 ob) {
        wight = ob.wight;
        height = ob.height;
        depth = ob.depth;
    }

    Box1(double w, double h, double d) {
        wight = w;
        height = h;
        depth = d;
    }

    Box1() {
        wight = -1;
        height = -1;
        depth = -1;
    }

    Box1(double len) {

        wight = height = depth = len;
    }

    double volume() {

        return wight * height * depth;
    }

}
