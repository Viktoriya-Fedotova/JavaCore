package main.java.com.name.javacore.chapter07;

public class OverloadCons {
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 15, 20);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        double vol;

        vol = mybox1.volume();
        System.out.println("Обьем куба mybox1 = " + vol);

        vol = mybox2.volume();
        System.out.println("Обьем куба mybox2 = " + vol);

        vol = mycube.volume();
        System.out.println("Обьем куба mycube = " + vol);
    }
}
