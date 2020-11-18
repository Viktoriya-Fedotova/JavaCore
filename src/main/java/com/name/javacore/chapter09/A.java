package main.java.com.name.javacore.chapter09;

public class A {
    public interface NestedIF {
        boolean isNotNegative(int x);
    }
}

class B implements A.NestedIF {
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}

class NestedIFDemo {
    public static void main(String[] args) {
        A.NestedIF nif = new B();
        if (nif.isNotNegative(10))
            System.out.println("Число 10 не отрицательное");
        if (nif.isNotNegative(-10))
            System.out.println("Это не будет выведено!");
    }
}

