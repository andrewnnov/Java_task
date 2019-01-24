package ru.bannikov.week10_16des;
/*
Implement an algorithm to determine is string has all unique characters.
What is you cannot use additional data structures?
 */

import java.util.HashSet;
import java.util.Set;

public class UniqueCharacters {

    public boolean determineUniqueCharactersSet(String world) {

        int lengthOfWorld = world.length();
        char[] strToArray = world.toCharArray();
        Set<Character> setCharacters = new HashSet<>();
        for (char aStrToArray : strToArray) {
            setCharacters.add(aStrToArray);
        }
        return lengthOfWorld == setCharacters.size();
    }

    public boolean determineUniqueCharacters(String world) {
        boolean result = true;
        int myChar = world.codePointCount(0, world.length()-1);
        char[] strToArray = world.toCharArray();
        for (int i = 0; i < strToArray.length; i++) {
            for(int j = i+1; j < strToArray.length; j++) {
                if(strToArray[i] == strToArray[j]) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
