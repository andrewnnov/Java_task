package ru.bannikov.oop_golovach.lecture1.examples;

import java.util.Arrays;
import java.util.List;

public class App002_collections {

    //Для максимальной эффективности желательно писать код учитывающий тип каждого элемента
    //любое приведение вниз, значит что человек не справился с ооп

    public static void main(String[] args) {

        Parent[] array = {new Parent(), new Child()};
        Parent ref0 = array[1];

        List<Parent> list = Arrays.asList(new Parent(), new Child());
        Parent ref1 = list.get(1);
    }
}
