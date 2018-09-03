package com.cramer.project.numbers.server;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class NumbersTest {


    private static Numbers numbers;

    @BeforeClass
    public static void setup() {
        numbers = new Numbers();
    }

    @Test
    public void nthDigitOfPiTest() {
        //3.14159265358979323846;
        assertThat(numbers.nthDigitOfPi(4), is(3.141));
        assertThat(numbers.nthDigitOfPi(1), is(3.0));
        assertThat(numbers.nthDigitOfPi(9), is(3.14159265));
        assertThat(numbers.nthDigitOfPi(0), is(0.0));
        assertThat(numbers.nthDigitOfPi(-5), is(0.0));
        assertThat(numbers.nthDigitOfPi(30), is(3.141592653589793));
    }

    @Test
    public void nthDigitOfETest() {
        //2.7182818284590452354
        assertThat(numbers.nthDigitOfE(4), is(2.718));
        assertThat(numbers.nthDigitOfE(1), is(2.0));
        assertThat(numbers.nthDigitOfE(9), is(2.71828182));
        assertThat(numbers.nthDigitOfE(0), is(0.0));
        assertThat(numbers.nthDigitOfE(-5), is(0.0));
        assertThat(numbers.nthDigitOfE(30), is(2.718281828459045));
    }

    @Test
    public void getFibonacciSequenceIndexTest() {
        assertThat(numbers.getFibonacciSequenceIndex(1), is(1));
        assertThat(numbers.getFibonacciSequenceIndex(2), is(1));
        assertThat(numbers.getFibonacciSequenceIndex(3), is(2));
        assertThat(numbers.getFibonacciSequenceIndex(4), is(3));
        assertThat(numbers.getFibonacciSequenceIndex(5), is(5));
        assertThat(numbers.getFibonacciSequenceIndex(6), is(8));
        assertThat(numbers.getFibonacciSequenceIndex(7), is(13));
        assertThat(numbers.getFibonacciSequenceIndex(8), is(21));
    }


    @Test
    public void getPrimeFactorizationTest() {
        assertThat(numbers.getPrimeFactorization(8), containsInAnyOrder(2, 2, 2));
        assertThat(numbers.getPrimeFactorization(7), containsInAnyOrder(7));
        assertThat(numbers.getPrimeFactorization(15), containsInAnyOrder(3, 5));


    }

}