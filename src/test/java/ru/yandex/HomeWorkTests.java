package ru.yandex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class HomeWorkTests {

    @Test
    @DisplayName("Тесты метода reverse")
    void reverseTest() {
        Assertions.assertEquals(8765, HomeWork.reverse(5678));
        Assertions.assertEquals(2007, HomeWork.reverse(7002));
        Assertions.assertEquals(7000, HomeWork.reverse(7));
        Assertions.assertEquals(42, HomeWork.reverse(2400));
    }

    @Test
    @DisplayName("Тесты метода difference")
    void differenceTest() {
        Assertions.assertEquals(22, HomeWork.difference(8765));
        Assertions.assertEquals(0, HomeWork.difference(5252));
        Assertions.assertEquals(-89, HomeWork.difference(1099));
        Assertions.assertEquals(27, HomeWork.difference(2700));
    }
}
