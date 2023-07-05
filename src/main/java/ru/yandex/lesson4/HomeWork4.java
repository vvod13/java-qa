package ru.yandex.lesson4;

public class HomeWork4 {

    public static boolean isSorted(int[] array) {
        boolean sortedAsc = true, sortedDesc = true;
        if (array.length <= 2) {
            return true;
        } else {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i + 1] < array[i]) sortedAsc = false;
                if (array[i + 1] > array[i]) sortedDesc = false;
            }
        }
        return sortedAsc || sortedDesc;
    }

    public static long maxTwinMultiply(int[] array) {
        long max = (long) array[0] * (long) array[1];
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                long multiply = (long) array[i] * (long) array[j];
                if (multiply > max) max = multiply;
            }
        }
        return max;
    }
}
