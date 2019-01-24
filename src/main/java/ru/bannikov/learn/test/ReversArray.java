package ru.bannikov.learn.test;

import java.util.Arrays;

public class ReversArray {

    public static void main(String[] args) {

        int[] mass = {1, 2, 3, 4, 5, 6, 7,};
        System.out.println(Arrays.toString(revers(mass)));
    }

    public static int[] revers(int[] a) {
        for (int i = 0; i < a.length/2 ; i++) {
            int tmp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = tmp;
        }
        return a;
    }
}
