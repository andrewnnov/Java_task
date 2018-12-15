package ru.bannikov.week10_16des;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UniqueCharactersTest {

    @Test
    public void whenCharactersHasUniqueThenTrue() {

        UniqueCharacters newWord = new UniqueCharacters();

        assertEquals(true, newWord.determineUniqueCharacters("age"));
    }

    @Test
    public void whenCharactersHasNotUniqueThenTrue() {

        UniqueCharacters newWord = new UniqueCharacters();

        assertEquals(false, newWord.determineUniqueCharacters("hello"));
    }

}
