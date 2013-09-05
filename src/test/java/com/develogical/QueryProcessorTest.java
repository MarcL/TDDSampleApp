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
}
