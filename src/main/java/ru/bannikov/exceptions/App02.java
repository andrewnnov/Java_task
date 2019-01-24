package ru.bannikov.exceptions;

/*
examples of exceptions
 */
public class App02 {

    public static void main(String[] args) {
        System.err.println(">0");
        f();
        System.err.println("<0");
    }

    private static void f() {
        System.err.println("  >1");
        g();
        System.err.println("  <1");
    }

    private static void g() {
        System.err.println("    >2");
        h();
        System.err.println("    <2");
    }

    private static void h() {
        throw new RuntimeException();
    }
}
