package main.java.com.name.javacore.chapter09;

public interface MyIF {
    int getNumber();
    default String getString() {

        return "Обьект типа String по умолчанию";
    }
    static int getDefaultNumber() {
        return 0;
    }
}
