package ru.bannikov.exceptions;

/*
the power of operators
continue
break
return
throw
 */
public class App00 {

    public static void main(String[] args) {
        for (int i = 0; i < 2 ; i++) {
            f();
            System.err.println();
        }
    }

    private static void f() {
        for (int i = 0; i < 2 ; i++) {
            System.err.print(0);
            if(true)
            //continue;
            //break;
            //return;
            //throw new Error();
            System.err.print(1);
        }
        System.err.print(2);
    }
}
