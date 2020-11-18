package main.java.com.name.javacore.chapter08;

public class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        BoxWeight mybox3 = new BoxWeight();
        BoxWeight mycube = new BoxWeight(5, 0.675);
        BoxWeight myclone = new BoxWeight(mybox1);
        double vol;

        vol = mybox1.volume();
        System.out.println("Обьем mybox1 = " + vol);
        System.out.println("Вес mybox1 = " + mybox1.weight);


        vol = mybox2.volume();
        System.out.println("Обьем mybox2 = " + vol);
        System.out.println("Вес mybox2 = " + mybox2.weight);




    }
}
