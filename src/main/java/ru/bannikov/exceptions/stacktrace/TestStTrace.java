package ru.bannikov.exceptions.stacktrace;

public class TestStTrace {

    public static void main(String[] args) {

        method1();
    }

    private static void method1() {
        method2();
    }

    private static void method2() {
        method3();

    }

    private static void method3() {

        StackTraceElement [] stackTraceElements = new Exception().getStackTrace();
        for (StackTraceElement el: stackTraceElements) {
            System.out.println(el);
        }
    }
}
