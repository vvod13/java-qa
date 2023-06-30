package ru.yandex.lesson2.homework;

public class Main {
    public static void main(String[] args) {
        Sku sku1 = new Sku(2700, 5279, "Скушечное описание");
        Lot lot1 = new Lot(1000708, sku1, 10);
        Loc loc1 = new Loc();
        loc1.setSerialKey(100500);
        loc1.setName("Лок именной №1");
        loc1.setDimensions(30.0, 40.0, 35.0);
        loc1.setXyz(5, 5, 5);
        loc1.setZone("Зона 2");
        SerialInventory serialInventory = SerialInventoryBuilder.builder()
            .withSerialKey(9000)
            .withSKu(sku1)
            .withLot(lot1)
            .withLoc(loc1)
            .withQuantity(2700)
            .build();
        System.out.println(serialInventory);
    }
}
