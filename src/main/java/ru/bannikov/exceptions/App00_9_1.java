package ru.bannikov.exceptions;

public class App00_9_1 {

    public static void main(String[] args) {

        //Object ref = new int[]{0, 1, 2}; //c точки зрения JVM у ref можно взять int k = ref[0]
        //int k = ref[0];      //но компилятор проверяет левые части и в Object нет []
       // System.out.println();

        try {

            Throwable t = new RuntimeException();
          //  throw t;                    //компилятор проверяет левую часть. Он запретил хорошую программу

        }catch (Exception e) {

        }

    }
}
