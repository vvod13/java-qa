package ru.yandex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ru.yandex.lesson3.homework.Homework3;

public class Hw3Test {

    @Test
    void homework3Test() {
        Assertions.assertEquals(0, Homework3.figureCount(0));
        Assertions.assertEquals(7, Homework3.figureCount(7));
        Assertions.assertEquals(5, Homework3.figureCount(23));
        Assertions.assertEquals(9, Homework3.figureCount(-306));
        Assertions.assertEquals(3, Homework3.figureCount(399));
        Assertions.assertEquals(7, Homework3.figureCount(9223372036854775807L));
        Assertions.assertEquals(8, Homework3.figureCount(8999999999999999999L));
        Assertions.assertEquals(7, Homework3.figureCount(7999999999999999999L));
        Assertions.assertEquals(4, Homework3.figureCount(-60006667));
    }
}
