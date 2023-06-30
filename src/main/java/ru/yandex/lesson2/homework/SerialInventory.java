package ru.yandex.lesson2.homework;

public class SerialInventory {

    private long serialKey;
    private Sku sku;
    private Lot lot;
    private Loc loc;
    private long quantity;

    public SerialInventory (long serialKey, Sku sku, Lot lot, Loc loc, long quantity) {
        this.serialKey = serialKey;
        this.sku = sku;
        this.lot = lot;
        this.loc = loc;
        this.quantity = quantity;
    }
}
