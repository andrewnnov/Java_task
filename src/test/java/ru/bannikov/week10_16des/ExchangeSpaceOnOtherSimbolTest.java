package ru.bannikov.week10_16des;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ExchangeSpaceOnOtherSimbolTest {


    @Test
    public void whenSpaceIsHereThenReplaceIt() {

        String inputWord = "Mr Jonh Smith    ";

       ExchangeSpaceOnOtherSimbol exchangeSpaceOnOtherSimbol = new ExchangeSpaceOnOtherSimbol();
        String result = exchangeSpaceOnOtherSimbol.replacemenSpace(inputWord);
        String expected = "Mr%20MrJonh%20JonhSmith";
        assertThat(result, is(expected));
    }
}
