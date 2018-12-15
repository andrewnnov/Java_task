package ru.bannikov.week10_16des;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OnePermutationOfOtherTest {

    @Test
    public void whenFirstWordIsPermutateSecondThenTrue() {

        OnePermutationOfOther newWord = new OnePermutationOfOther();

        assertEquals(true, newWord.decidePermutationOfStrings("ag", "ag"));
    }

    @Test
    public void whenFirstWordIsNotPermutateSecondThenFalse() {

        OnePermutationOfOther newWord = new OnePermutationOfOther();

        assertEquals(false, newWord.decidePermutationOfStrings("ag", "ak"));
    }

    @Test
    public void whenFirstWordMoreThenSecondThenFalse() {

        OnePermutationOfOther newWord = new OnePermutationOfOther();

        assertEquals(false, newWord.decidePermutationOfStrings("yandex", "ak"));
    }


    @Test
    public void whenFirstWordAAAAIsPermutateSecondThenTrue() {

        OnePermutationOfOther newWord = new OnePermutationOfOther();

        assertEquals(false, newWord.decidePermutationOfStrings("aaaa", "aaaa"));
    }





}
