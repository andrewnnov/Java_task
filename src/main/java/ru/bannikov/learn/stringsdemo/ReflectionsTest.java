package ru.bannikov.learn.stringsdemo;

import ru.bannikov.learn.access.Person;

import java.lang.reflect.Field;

public class ReflectionsTest {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Person person = new Person();
        Field field = Person.class.getDeclaredField("name");
        field.setAccessible(true);
        field.set("name", "Kolya");
        String newName = (String) field.get(person);
        System.out.println(newName);


    }
}
