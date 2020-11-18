package main.java.com.name.javacore.chapter08;

public class ShipmentDemo {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);
        double vol;

        vol = shipment1.volume();
        System.out.println("Обьем посылки №1 = " + vol);
        System.out.println("Вес посылки №1 = " + shipment1.weight + " кг.");
        System.out.println("Стоимость доставки посылки №1: $" + shipment1.cost);
        System.out.println();

        vol = shipment2.volume();
        System.out.println("Обьем посылки №2 = " + vol);
        System.out.println("Вес посылки №2 = " + shipment2.weight + " кг.");
        System.out.println("Стоимость доставки посылки №2: $" + shipment2.cost);
        System.out.println();

    }
}
