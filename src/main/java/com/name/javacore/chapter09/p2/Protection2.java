package main.java.com.name.javacore.chapter09.p2;

public class Protection2 extends main.java.com.name.javacore.chapter09.p1.Protection {
    Protection2() {
        System.out.println("Конструктор, унаследованный из другого пакета");
        //доступна только для класса или пакета, где обьявлена (доступ по умолчанию)
        //System.out.println("n = " + n);

        //доступна только для того класса, где была обьявлена
        //System.out.println("n_pri = " + n_pri);

        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}

class OtherPackage {
    OtherPackage() {
        main.java.com.name.javacore.chapter09.p1.Protection p = new main.java.com.name.javacore.chapter09.p1.Protection();
        System.out.println("Конструктор из другого пакета");

        System.out.println("n_pub = " + p.n_pub);
    }
}
