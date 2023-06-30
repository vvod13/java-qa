package ru.yandex.lesson2.homework;

public class Lot {

    private long serialKey;
    private Sku sku;
    private long quantity;

    public Lot (long serialKey, Sku sku, long quantity) {
        this.serialKey = serialKey;
        this.sku = sku;
        this.quantity = quantity;
    }
}
