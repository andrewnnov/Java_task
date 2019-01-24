package ru.bannikov.learn.access;

public class A {

    private String poleA = "Доказательство";

     private void print() {
         System.out.println(poleA);
     }

     protected void printAAA() {
         print();
     }
}
