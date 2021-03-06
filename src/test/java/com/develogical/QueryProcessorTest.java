package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.StringContains.containsString;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        assertThat(queryProcessor.process("test"), is(""));
    }

    @Test
    public void knowsAboutProgramming() throws Exception {
        assertThat(queryProcessor.process("programming"), containsString("computing"));
    }

    @Test
    public void knowsAboutCakes() throws Exception {
        assertThat(queryProcessor.process("cakes").toLowerCase(), containsString("battenberg"));
    }

    @Test
    public void knowsAboutCheese() throws Exception {
        assertThat(queryProcessor.process("cheese").toLowerCase(), containsString("milk"));
    }

    @Test
    public void knowsAboutChocolate() throws Exception {
        assertThat(queryProcessor.process("chocolate").toLowerCase(), containsString("chocolate"));
    }

    @Test
    public void knowsAboutAubergines() throws Exception {
        assertThat(queryProcessor.process("aubergines".toLowerCase()), containsString("aubergine"));
    }

    @Test
    public void knowsWhatNameIs() throws Exception {
        assertThat(queryProcessor.process("698ad0b0:what is your name"), containsString("Aubergines"));
    }

    @Test
    public void knowsWhatLargestNumberIs() throws Exception {
        assertThat(queryProcessor.process("698ad0b0:which of the following numbers is the largest: 977, 25"), containsString("977"));
    }

    @Test
    public void knowsWhatAnotherLargeNumberIs() throws Exception {
        assertThat(queryProcessor.process("698ad0b0:which of the following numbers is the largest: 49, 473"), containsString("473"));
    }

    @Test
    public void knowsWhichNumberIsLargestForThreeNumbers() throws Exception {
        assertThat(queryProcessor.process("698ad0b0:which of the following numbers is the largest: 49, 473, 1024"), containsString("1024"));
    }

    @Test
    public void knowsWhatLargestNumberIsWithId() throws Exception {
        assertThat(queryProcessor.process("698ad0b0:which of the following numbers is the largest: 977, 25"), containsString("977"));
    }

    @Test
    public void knowsWhatSomeNumbersAddedAre() throws Exception {
        assertThat(queryProcessor.process("698ad0b0:what is 10 plus 12"), containsString("22"));
    }

    @Test
    public void knowsWhatSomeMoreNumbersAddedAre() throws Exception {
        assertThat(queryProcessor.process("698ad0b0:what is 20 plus 12"), containsString("32"));
    }

    @Test
    public void knowsWhatSomeNumbersMultipliesAre() throws Exception {
        assertThat(queryProcessor.process("698ad0b0:what is 2 multiplied by 2"), containsString("4"));
    }

    @Test
    public void knowsWhatSomeMoreNumbersMultipliesAre() throws Exception {
        assertThat(queryProcessor.process("698ad0b0:what is 2 multiplied by 3"), containsString("6"));
    }

    @Test
    public void knowsWhatPrimeNumbersAre() throws Exception {
        assertThat(queryProcessor.process("698ad0b0:which of the following numbers are primes: 735, 37"), containsString("37"));
    }

    @Test
    public void knowsWhatCorrectPrimeNumbersAre() throws Exception {
        assertThat(queryProcessor.process("698ad0b0:which of the following numbers are primes: 40, 281"), containsString("281"));
    }

    @Test
    public void knowsWhatCorrectPrimeNumbersAreInListOfFour() throws Exception {
        assertThat(queryProcessor.process("698ad0b0:which of the following numbers are primes: 158, 449, 711, 463"), containsString("449, 463"));
    }

    @Test
    public void knowsWhatCorrectPrimeNumbersAreInListOfThree() throws Exception {
        assertThat(queryProcessor.process("698ad0b0:which of the following numbers are primes: 158, 449, 711"), containsString("449"));
    }

    @Test
    public void knowsWhatColourABananaIs() throws Exception {
        assertThat(queryProcessor.process("698ad0b0:what colour is a banana"), containsString("yellow"));
    }

    @Test
    public void knowsWhatTheFibonacciSequenceIs() throws Exception {
        assertThat(queryProcessor.process("698ad0b0:what is the 17th number in the Fibonacci sequence"), containsString("1597"));
    }

    @Test
    public void knowsWhatThe22ndNumberInFibonacciSequenceIs() throws Exception {
        assertThat(queryProcessor.process("698ad0b0:what is the 22nd number in the Fibonacci sequence"), containsString("17711"));
    }

    @Test
    public void knowsWhatNumbersSubtractedAre() throws Exception {
        assertThat(queryProcessor.process("698ad0b0:what is 10 minus 8"), containsString("2"));
    }

    @Test
    public void knowsWhatMoreNumbersSubtractedAre() throws Exception {
        assertThat(queryProcessor.process("698ad0b0:what is 20 minus 10"), containsString("10"));
    }
}
