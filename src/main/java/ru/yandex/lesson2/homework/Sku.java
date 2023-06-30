package ru.yandex.lesson2.homework;

public class Sku {

    private long serialKey;
    private long storerKey;
    private String description;

    public Sku (long serialKey, long storerKey, String description) {
        this.serialKey = serialKey;
        this.storerKey = storerKey;
        this.description = description;
    }
}
