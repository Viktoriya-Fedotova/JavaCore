package main.java.com.name.javacore.chapter06;

public class Box {  //класс определяет новый тип данных под названием Box
                    //обьявление class создает только шаблон, а не конкретный обьект
    double width;
    double height;
    double depth;

    double volume() {

        return width * height * depth;
    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }



}
