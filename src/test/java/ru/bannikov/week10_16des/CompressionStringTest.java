package ru.bannikov.week10_16des;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CompressionStringTest {

    @Test
    public void thenWordIsCompressionThenPrintNewWord() {
        CompressionString compressionString = new CompressionString();
        String inputWord = "aabcccccaaa";
        String result = compressionString.compressString(inputWord);
        String expected = "a2b1c5a3";
        assertEquals(expected, result);
    }

    @Test
    public void thenWordIsConsist2CharPrintThisWord() {
        CompressionString compressionString = new CompressionString();
        String inputWord = "al";
        String result = compressionString.compressString(inputWord);
        String expected = "al";
        assertEquals(expected, result);
    }
}
