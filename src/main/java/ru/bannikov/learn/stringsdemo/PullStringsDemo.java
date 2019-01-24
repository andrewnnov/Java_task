package ru.bannikov.learn.stringsdemo;

public class PullStringsDemo {

    public static void main(String[] args) {

        String str = "Hello";
        String str2 = "Hello";

        String str3 = new String("Hello");
        String str4 = new String("Hello");
        System.out.println(str==str2);
        System.out.println(str3==str4);


        String str5 = new String("Vasa").intern();
        String str6 = "Vasa";

        System.out.println(str5 == str6);
    }
}
