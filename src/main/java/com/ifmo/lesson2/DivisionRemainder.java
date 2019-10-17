package com.ifmo.lesson1;

public class DivisionRemainder {

    public static void main(String[] args) {
        int q = 21;
        int w = 8;

        calculate(q, w);
    }

    public static void calculate(int q, int w) {
        int i = q / w;
        int r = q % w;

        System.out.printf("%s / %s = %s и %s в остатке\n", q, w, i, r);
    }
}
