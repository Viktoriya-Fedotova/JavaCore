package main.java.com.name.javacore.chapter06;

public class BoxDemo6 {
    public static void main(String[] args) {
        Box1 mybox1 = new Box1();
        Box1 mybox2 = new Box1();
        double vol;

        vol = mybox1.volume();
        System.out.println("Обьем первого куба = " + vol);

        vol = mybox2.volume();
        System.out.println("Обьем второго куба = " + vol);
    }
}
