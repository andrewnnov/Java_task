package ru.functional;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionalJavaLessons {

    public static void main(String[] args) {

//        Predicate<Integer> predicate = x -> x > 5;
//        System.out.println(predicate.test(3));

        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");

        for (String s: list) {
            System.out.println(s);
        }

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Stream<String> stream = list.stream();
        stream.forEach(x -> System.out.println(x));

        list.stream().forEach(x-> System.out.println("I'm stream " + x));

        list.stream().filter(x-> {
            System.out.println(x);
            return x.equals("one");
        }).count();

        Set<String> newSet = list.stream().filter(x->x.equals("one")).collect(Collectors.toSet());
        newSet.stream().forEach(x-> System.out.println(x));

        List<String> listBig = list.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
        listBig.stream().forEach(x-> System.out.println(x));

        List<Integer> numberList = new ArrayList<>();
        numberList.add(7);
        numberList.add(2);
        numberList.add(9);
        numberList.add(4);
        numberList.add(3);
        numberList.add(6);
        numberList.add(1);
        numberList.add(8);
        numberList.add(5);

        Integer maxValue = numberList.stream().max(Comparator.comparing(x ->x)).get();
        System.out.println(maxValue);

        int sum = numberList.stream().reduce(0, (arg, element)-> arg + element);
        System.out.println(sum);




        numberList.stream().sorted().collect(Collectors.toList()).stream().forEach(x-> System.out.println(x));



    }
}
