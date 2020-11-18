package main.java.com.name.javacore.chapter06;

public class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();

        double vol;
        //присваивание значений перменным обькта mybox
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        //рассчитать обьем параллелипипида
        vol = mybox.width * mybox.height * mybox.depth;
        System.out.println("Обьем параллелипипида равен = " + vol);
    }
}
