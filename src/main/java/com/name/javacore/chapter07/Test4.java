package main.java.com.name.javacore.chapter07;

public class Test4 {
    int a; //уровень доступа по умолчанию
    public int b; // открытый уровень доступа
    private int c; // закрытый уровень доступа

    void setC(int i) {
        c = i;
    }

    int getC() {
        return c;
    }
}

class AccessTest {
    public static void main(String[] args) {
        Test4 ob = new Test4();

        ob.a = 10;
        ob.b = 20;

        ob.setC(100);

        System.out.println("a, b и с: " + ob.a + ", " + ob.b + ", " + ob.getC());

    }
}
