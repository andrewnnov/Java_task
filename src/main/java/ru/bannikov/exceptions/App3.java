package ru.bannikov.exceptions;

/*
Если в finally бросить исключение, то оно перебьет уже летящее исключение
Если внутри finally написать return он перебьет существуюее исключение
 */

public class App3 {

    public static void main(String[] args) {
        System.err.println(0);

        try {
            System.err.println(1);
            if(true) throw new Error();

        }finally {
            System.err.println(2);
            if(true) throw new RuntimeException();
        }
        System.err.println(3);
    }
}
