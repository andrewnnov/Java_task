package ru.bannikov.week10_16des;
/*
Write a method to replace all spaces in a string with %20
 */

public class ExchangeSpaceOnOtherSimbol {

    public String replacemenSpace(String word) {
        String result = "";
        String[] subString;
        String delimeter = " ";
        subString = word.split(delimeter);

        for (int i = 0; i < subString.length ; i++) {
            if (i != subString.length -1) {
                result += subString[i] + "%20";
            }
            result += subString[i];
        }

        return result;
    }
}
