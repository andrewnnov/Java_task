package ru.bannikov.bit;

public class TestBitOperations {

    public static void main(String[] args) {
        byte x = 64;
        byte y;
        int i;
        i = x << 2;
        y = (byte) (x << 2);
        System.out.println(i);
        System.out.println(y);
    }
}
