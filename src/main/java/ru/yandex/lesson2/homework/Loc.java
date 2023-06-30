package ru.yandex.lesson2.homework;

public class Loc {

    private long serialKey;
    private String name;
    private double length;
    private double width;
    private double height;
    private int x;
    private int y;
    private int z;
    private String zone;

    public void setDimensions(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void setXyz(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void setSerialKey(long serialKey) { this.serialKey = serialKey; }

    public void setName(String name) { this.name = name; }

    public void setZone(String zone) { this.zone = zone; }

}
