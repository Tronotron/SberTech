package com.ifmo.lesson1;

public class TwoDigitsSum {

    public static void main(String[] args) {
        int n = 36;

        int sum = sum(n);

        System.out.println(sum);
    }

    public static int sum(int n) {
        int h = n / 10;
        int l = n % 10;

        return h + l;
    }
}
