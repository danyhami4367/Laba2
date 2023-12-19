package ru.imit.omsu;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;


public class StringProcessorTest {

    @Test
    void repeatString_negativeN_exceptionThrown() {
        StringProcessor stringProcessor = new StringProcessor();
        assertThrows(IllegalArgumentException.class, () -> stringProcessor.repeatString("test", -1));
    }

    @Test
    void repeatString_zeroLength_emptyStringReturned() {
        StringProcessor stringProcessor = new StringProcessor();
        assertEquals("", stringProcessor.repeatString("test", 0));
    }

    @Test
    void repeatString_positiveN_stringRepeatedNTimes() {
        StringProcessor stringProcessor = new StringProcessor();
        assertEquals("testtesttest", stringProcessor.repeatString("test", 3));
    }

    @Test
    void countOccurrences_subStringInMainString_countReturned() {
        StringProcessor stringProcessor = new StringProcessor();
        assertEquals(2, stringProcessor.countOccurrences("testtest", "test"));
    }

    @Test
    void countOccurrences_subStringNotFound_zeroReturned() {
        StringProcessor stringProcessor = new StringProcessor();
        assertEquals(0, stringProcessor.countOccurrences("test test test", "ababaa"));
    }

    @Test
    void replaceDigitsWithString_replaceExpectedValues() {
        StringProcessor stringProcessor = new StringProcessor();
        assertEquals("одиндватри", stringProcessor.DigToString("123"));
    }

    @Test
    void removeEverySecondCharacter_sbModified() {
        StringProcessor stringProcessor = new StringProcessor();
        StringBuilder sb = new StringBuilder("abcdefg");
        stringProcessor.removeEverySecondCharacter(sb);
        assertEquals("aceg", sb.toString());
    }
}