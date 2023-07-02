package ru.yandex.lesson3.homework;

public class Homework3 {

    public static int figureCount(long x) {
        int result = 0;
        x = Math.abs(x);
        if (x < 10) return (int) x;
        while (x > 0) {
            result += x % 10;
            x /= 10;
        }
        if (result > 99) {
            result = result % 10 + (result / 10 - 10) + 1;
        } else if (result > 9) {
            result = result % 10 + result / 10;
        }
        if (result > 9) { result = result % 10 + 1; }
        return result;
    }
}
