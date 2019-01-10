package ru.bannikov.exceptions.test;

public class stepicTest {

    public static void main(String[] args) {

        try {
            System.exit(0);
            if(true) throw new Exception();
            System.err.println(1);
        } catch (Exception e) {
            System.err.println(2);
        } finally {
            System.err.println(3);
        }

    }
}
