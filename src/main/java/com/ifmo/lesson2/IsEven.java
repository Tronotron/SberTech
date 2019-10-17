package com.ifmo.lesson1;

public class IsEven {

    public static void main(String[] args) {
        int n = 68;

        System.out.println(isEven(n));
    }

    public static boolean isEven(int n) {
        return (n & 1) == 0;
    }
}
