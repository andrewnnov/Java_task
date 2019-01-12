package ru.bannikov.oop.lecture1;

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
