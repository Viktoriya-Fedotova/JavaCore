package main.java.com.name.javacore.chapter02;

public class Example2 {
    public static void main(String[] args) {
        int num;  //Обьявляем переменную num, которая имеет тип данных int

        num = 100; // инициализация переменной num, присвоили ей значение 100

        System.out.println("Это переменная num: " + num); // метод выводит на экран строку в кавычках + значение переменной num

        num = num*2;

        System.out.print("Значение переменной num*2 равно "); //метод print после каждого вывозова не выводит символ новой строки
        System.out.println(num); //таким образом данные строчки напечатаются в одной строке
    }
}
