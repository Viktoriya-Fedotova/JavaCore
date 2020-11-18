package main.java.com.name.javacore.chapter03;

public class Light {
    public static void main(String[] args) {
        int lightspeed; // Обьявили переменную
        long days; // Обьявили переменную
        long seconds;  // Обьявили переменную
        long distance;  // Обьявили переменную

        lightspeed = 186000; // инициализировали переменную lightspeed

        days = 1000; // инициализировали переменную days

        seconds = days * 24 * 60 * 60;

        distance = lightspeed * seconds;

        System.out.print("За " + days);
        System.out.print(" дней свет пройдет ");
        System.out.println(distance + " миль.");


    }
}
