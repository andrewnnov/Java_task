package ru.bannikov.exceptions.test;

public class test {

    public static void main(String[] args) {

        A a = new A();
        Object b = new B();

        a = (A) b;
    }
}
