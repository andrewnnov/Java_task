package ru.bannikov.oop_golovach.lecture1.examples;

public class App01 {

    public static void main(String[] args) {
        funArg(new Child());
        Parent ref = funReturn();
    }

    private static Parent funReturn() {

        return new Child();
    }

    //максимально возможный тип. Полиморфизм
    private static void funArg(Parent child) {
    }


}
