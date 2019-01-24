package ru.bannikov.week10_16des;
/*
Implement a method to perform basic string compression using the counts of repeat characters.
For example, the string aabcccccaaa would become a2b1c5a3. If compressed string would not become smaller than
the original string, your method should return the original string.
 */

import java.util.HashMap;
import java.util.Map;

public class CompressionString {


    public String compressString(String word) {

        int wordLength = word.length();
        String result = "";

        if(word.length() < 2) {
            return word;
        }

        char lastChar = word.charAt(0);
        int charCount = 1;

        for (int i = 1; i < wordLength; i++) {

            if(word.charAt(i) == lastChar) {
                charCount++;
            } else {
                result = result + Character.toString(lastChar) + Integer.toString(charCount);
                lastChar = word.charAt(i);
                charCount = 1;
            }
        }

        result += Character.toString(lastChar) + Integer.toString(charCount);

        if(result.length() < wordLength) {
            return result;
        } else {
            return word;
        }

    }
}


