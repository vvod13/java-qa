package ru.yandex.lesson5;

public class HomeWork {

    /**
     * aaaabbbcdd -> 4(a)3(b)1(c)2(d)
     * abc -> 1(a)1(b)1(c)
     * aaaaaaaaaa -> 10(a)
     * */
    public static String rleCompress(String src) {
        if (src.length() == 0) {
            return "";
        } else if (src.length() == 1) {
            return "1(" + src + ")";
        } else {
            StringBuilder sb = new StringBuilder();
            int counter = 1;
            for (int i = 0; i < src.length() - 1; i++) {
                if (src.charAt(i) != src.charAt(i + 1)) {
                    sb.append(counter);
                    sb.append("(");
                    sb.append(src.charAt(i));
                    sb.append(")");
                    counter = 1;
                } else {
                    counter++;
                }
            }
            sb.append(counter);
            sb.append("(");
            sb.append(src.charAt(src.length() - 1));
            sb.append(")");
            return sb.toString();
        }
    }

    /**
     * 4(a)3(b)1(c)2(d) -> aaaabbbcdd
     * 1(a)1(b)1(c) -> abc
     * 10(a) -> aaaaaaaaaa
     * */
    // Есть ограничение, не умеет экранировать скобочки
    public static String rleDecompress(String src) {
        String [] subStrings = src.split("\\)");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < subStrings.length; i++) {
            StringBuilder sbc = new StringBuilder();
            int counter = 0;
            char letter = ' ';   // нужно хоть как-то инициализировать было :(
            for (int j = 0; j < subStrings[i].length() - 1; j++) {
                if (subStrings[i].charAt(j) != '(') {
                    sbc.append(subStrings[i].charAt(j));
                } else {
                counter = Integer.valueOf(sbc.toString());
                letter = subStrings[i].charAt(j + 1);
                }
            }
            for (int k = 0; k < counter; k++) {
                sb.append(letter);
            }
        }
        return sb.toString();
    }
}
