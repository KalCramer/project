package com.cramer.project.numbers.api;

import java.util.List;

public interface NumbersAPI {

    double nthDigitOfPi(int digits);

    double nthDigitOfE(int digits);

    int getFibonacciSequenceIndex(int i);

    List<Integer> getPrimeFactorization(int number);

}
