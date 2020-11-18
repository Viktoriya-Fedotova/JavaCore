package main.java.com.name.javacore.chapter07;

public class OverloadCons2 {
    public static void main(String[] args) {
        //создаем кубы, используя разные конструкторы
        Box1 mybox1 = new Box1(10, 15, 25);
        Box1 mybox2 = new Box1();
        Box1 mycube = new Box1(5);

        Box1 myclone = new Box1(mybox1);

        double vol;

        vol = mybox1.volume();
        System.out.println("Обьем первого куба = " + vol);

        vol = mybox2.volume();
        System.out.println("Обьем второго куба = " + vol);

        vol = mycube.volume();
        System.out.println("Обьем куба mycube = " + vol);

        vol = myclone.volume();
        System.out.println("Обьем куба myclone = " + vol);
    }
}
