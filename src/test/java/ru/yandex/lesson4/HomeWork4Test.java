package ru.yandex.lesson4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class HomeWork4Test {

    @Test
    @DisplayName("Тесты метода isSorted")
    void isSortedTest() {
        Assertions.assertTrue(HomeWork4.isSorted(new int[]{1, 1, 1, 5}));
        Assertions.assertTrue(HomeWork4.isSorted(new int[]{1000, 999, 60, 5}));
        Assertions.assertTrue(HomeWork4.isSorted(new int[]{200000, -3}));
        Assertions.assertTrue(HomeWork4.isSorted(new int[]{0, 2700}));
        Assertions.assertTrue(HomeWork4.isSorted(new int[]{7, 7, 7, 7, 7}));
        Assertions.assertTrue(HomeWork4.isSorted(new int[]{40, -10}));
        Assertions.assertTrue(HomeWork4.isSorted(new int[]{10000}));
        Assertions.assertTrue(HomeWork4.isSorted(new int[]{}));
        Assertions.assertFalse(HomeWork4.isSorted(new int[]{22, 33, 44, 77, 76}));
        Assertions.assertFalse(HomeWork4.isSorted(new int[]{-5, -6, -7, -9, 0}));
        Assertions.assertFalse(HomeWork4.isSorted(new int[]{22, 23, 23, 23, 22}));
    }

    @Test
    @DisplayName("Тесты метода maxTwinMultiply")
    void maxTwinMultiplyTest() {
        Assertions.assertEquals(5, HomeWork4.maxTwinMultiply(new int[]{1, 1, 1, 5}));
        Assertions.assertEquals(999000, HomeWork4.maxTwinMultiply(new int[]{1000, 999, 60, 5}));
        Assertions.assertEquals(-600000, HomeWork4.maxTwinMultiply(new int[]{200000, -3}));
        Assertions.assertEquals(0, HomeWork4.maxTwinMultiply(new int[]{0, 2700}));
        Assertions.assertEquals(400000000000000L, HomeWork4.maxTwinMultiply(new int[]{-20000000, -20000000, 5}));
        Assertions.assertEquals(49, HomeWork4.maxTwinMultiply(new int[]{7, 7, 7, 7, 7}));
        Assertions.assertEquals(40, HomeWork4.maxTwinMultiply(new int[]{40, -10, 1}));
        Assertions.assertEquals(10, HomeWork4.maxTwinMultiply(new int[]{5, -10, -1}));
        Assertions.assertEquals(6, HomeWork4.maxTwinMultiply(new int[]{0, -2, 5, -3, 1}));
        Assertions.assertEquals(12, HomeWork4.maxTwinMultiply(new int[]{1, 2, 3, 4}));
        Assertions.assertEquals(9, HomeWork4.maxTwinMultiply(new int[]{1, 3, 2, 3, -5}));
    }

}
