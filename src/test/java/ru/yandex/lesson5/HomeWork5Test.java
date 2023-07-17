package ru.yandex.lesson5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class HomeWork5Test {

    @Test
    @DisplayName("Тесты метода rleCompress")
    void rleCompressTest() {
        Assertions.assertEquals("", HomeWork.rleCompress(""));
        Assertions.assertEquals("1(a)", HomeWork.rleCompress("a"));
        Assertions.assertEquals("1(b)1(c)", HomeWork.rleCompress("bc"));
        Assertions.assertEquals("3(d)", HomeWork.rleCompress("ddd"));
        Assertions.assertEquals("2(e)1(f)", HomeWork.rleCompress("eef"));
        Assertions.assertEquals("1(g)4(h)", HomeWork.rleCompress("ghhhh"));
        Assertions.assertEquals("1(j)1(k)1(l)1(m)", HomeWork.rleCompress("jklm"));
        Assertions.assertEquals("11(n)", HomeWork.rleCompress("nnnnnnnnnnn"));
        Assertions.assertEquals("1(()2(1)1())", HomeWork.rleCompress("(11)"));
    }

    @Test
    @DisplayName("Тесты метода rleDecompress")
    void rleDecompressTest() {
        Assertions.assertEquals("", HomeWork.rleDecompress(""));
        Assertions.assertEquals("a", HomeWork.rleDecompress("1(a)"));
        Assertions.assertEquals("bc", HomeWork.rleDecompress("1(b)1(c)"));
        Assertions.assertEquals("ddd", HomeWork.rleDecompress("3(d)"));
        Assertions.assertEquals("eef", HomeWork.rleDecompress("2(e)1(f)"));
        Assertions.assertEquals("ghhhh", HomeWork.rleDecompress("1(g)4(h)"));
        Assertions.assertEquals("jklm", HomeWork.rleDecompress("1(j)1(k)1(l)1(m)"));
        Assertions.assertEquals("nnnnnnnnnnn", HomeWork.rleDecompress("11(n)"));
    }

}
