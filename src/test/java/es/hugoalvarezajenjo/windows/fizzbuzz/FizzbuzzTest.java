package es.hugoalvarezajenjo.windows.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzbuzzTest {

    @Test
    void shouldReturnFizzIfMultipleOfThree() {
        final Fizzbuzz fizz = new Fizzbuzz();
        final String text = fizz.execute(3);
        assertEquals("Fizz", text);
    }

    @Test
    void shouldReturnBuzzIfMultipleOfFive() {
        final Fizzbuzz fizz = new Fizzbuzz();
        final String text = fizz.execute(5);
        assertEquals("Buzz", text);
    }

    @Test
    void shouldReturnFizzbuzzIfMultipleOfFive() {
        final Fizzbuzz fizz = new Fizzbuzz();
        final String text = fizz.execute(15);
        assertEquals("FizzBuzz", text);
    }

    @Test
    void shouldReturnNumberIfNotMultipleOfTreeOrFive() {
        final Fizzbuzz fizz = new Fizzbuzz();
        final String text = fizz.execute(7);
        assertEquals("7", text);
    }

    @Test
    void shouldThrowExceptionIfNull() {
        final Fizzbuzz fizz = new Fizzbuzz();
        assertThrows(IllegalArgumentException.class, () -> fizz.execute(null));
    }
}
