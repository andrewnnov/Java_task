package ru.exeption_g;

public class App02 {

    public static void main(String[] args) {
        System.err.println("1>");
        try {
            f();
        } catch (RuntimeException e) {
            System.err.println("BAD..."); //желательно печатать через err
        }

        System.err.println("<1");
    }

    private static void f() {
        System.err.println("   2>");
        g();
        System.err.println("   <2");
    }

    private static void g() {
        System.err.println("     3>");
        h();
        System.err.println("     <3");
    }

    private static void h() {

        //  return;
        throw new RuntimeException();
    }
}
