package ru.bannikov.week10_16des;

import org.junit.Test;

import static org.junit.Assert.*;

public class OnePermutationOfOtherTest {

    @Test
    public void whenFirstWordIsPermutateSecondThenTrue() {
        OnePermutationOfOther newWord = new OnePermutationOfOther();
        assertTrue(newWord.decidePermutationOfStrings("ag", "ag"));
    }

    @Test
    public void whenFirstWordIsNotPermutateSecondThenFalse() {
        OnePermutationOfOther newWord = new OnePermutationOfOther();
        assertFalse(newWord.decidePermutationOfStrings("ag", "ak"));
    }

    @Test
    public void whenFirstWordMoreThenSecondThenFalse() {
        OnePermutationOfOther newWord = new OnePermutationOfOther();
        assertFalse(newWord.decidePermutationOfStrings("yandex", "ak"));
    }


    @Test
    public void whenFirstWordAAAAIsPermutateSecondThenTrue() {
        OnePermutationOfOther newWord = new OnePermutationOfOther();
        assertFalse(newWord.decidePermutationOfStrings("aaaa", "aaaa"));
    }
}
