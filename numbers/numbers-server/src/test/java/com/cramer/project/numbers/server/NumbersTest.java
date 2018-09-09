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

    @Test
    public void isPrimeTest() {
        assertThat(numbers.isPrime(8), is(false));
        assertThat(numbers.isPrime(7), is(true));
        assertThat(numbers.isPrime(15), is(false));
        assertThat(numbers.isPrime(2), is(true));
        assertThat(numbers.isPrime(17), is(true));
    }

    @Test
    public void nthPrimeTest() {
        assertThat(numbers.nthPrime(1), is(2));
        assertThat(numbers.nthPrime(2), is(3));
        assertThat(numbers.nthPrime(3), is(5));
        assertThat(numbers.nthPrime(4), is(7));
        assertThat(numbers.nthPrime(5), is(11));
        assertThat(numbers.nthPrime(6), is(13));
        assertThat(numbers.nthPrime(1000), is(7919));

    }

    @Test
    public void costOfTilingTest() {
        assertThat(numbers.costOfTiling(10, 12, 5), is(600.00));
        assertThat(numbers.costOfTiling(5.6, 13.4, 4.25), is(318.92));
        assertThat(numbers.costOfTiling(23.5, 18.4, 7.75), is(3351.10));
    }

    @Test
    public void mortgageMonthlyPaymentsTest() {
        assertThat(numbers.mortgageMonthlyPayments(200000, 0.0525, 30), is(1104.41));
        assertThat(numbers.mortgageMonthlyPayments(250000, 0.0625, 20), is(1827.32));
    }
}