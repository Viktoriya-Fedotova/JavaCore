package main.java.com.name.javacore.chapter08;

public class Aa {
    int i;
}

class Bb extends Aa {
    int i;  //эта переменная скрывает переменную i из суперкаласса Аа

    Bb(int a, int b) {
        super.i = a; // переменная i из суперкласса Аа
        i = b; // переменная i из подкласса Вb
    }

    void show() {
        System.out.println("Переменная i в суперклассе Аа: " + super.i);
        System.out.println("Переменная i в подклассе Bb: " + i);
    }
}

class UseSuper {
    public static void main(String[] args) {
        Bb subOb = new Bb(1, 2);

        subOb.show();
    }
}
