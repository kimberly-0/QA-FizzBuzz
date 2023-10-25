package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFizzBuzz {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void testPositiveNumber() {
        FizzBuzz.fizzBuzz(15);
        String expected = "1" + System.lineSeparator() +
                "2" + System.lineSeparator() +
                "Fizz" + System.lineSeparator() +
                "4" + System.lineSeparator() +
                "Buzz" + System.lineSeparator() +
                "Fizz" + System.lineSeparator() +
                "7" + System.lineSeparator() +
                "8" + System.lineSeparator() +
                "Fizz" + System.lineSeparator() +
                "Buzz" + System.lineSeparator() +
                "11" + System.lineSeparator() +
                "Fizz" + System.lineSeparator() +
                "13" + System.lineSeparator() +
                "14" + System.lineSeparator() +
                "FizzBuzz" + System.lineSeparator();

        assertEquals(expected, outContent.toString());
    }

    @Test
    public void testOne() {
        FizzBuzz.fizzBuzz(1);
        String expected = "1" + System.lineSeparator();
        assertEquals(expected, outContent.toString());
    }

    @Test
    public void testNegativeNumber() {
        FizzBuzz.fizzBuzz(-20);
        String expected = "";
        assertEquals(expected, outContent.toString());
    }

    @Test
    public void testZero() {
        FizzBuzz.fizzBuzz(0);
        String expected = "";
        assertEquals(expected, outContent.toString());
    }

}
