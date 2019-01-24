package ru.bannikov.week10_16des;

import java.util.stream.IntStream;

public class OnePermutationOfOther {

    public boolean decidePermutationOfStrings(String firstString, String secondString) {
        int count = 0;
        int firstStringLength = firstString.length();
        int secondStringLength = secondString.length();

        char[] arrayFirstString = firstString.toCharArray();
        char[] arraySecondString = secondString.toCharArray();

        if(firstStringLength == secondStringLength) {
            for (int i = 0; i < arrayFirstString.length; i++) {
                for (int j = 0; j < arrayFirstString.length ; j++) {
                    if(arrayFirstString[i] == arraySecondString[j]) {
                        count++;
                    }
                }
            }
            return (count == firstStringLength ? true : false);

        } else {

            return false;

        }
    }
}
