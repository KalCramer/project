
package com.cramer.project.numbers.server;

import com.cramer.project.numbers.api.NumbersAPI;

import java.util.ArrayList;
import java.util.List;

public class Numbers implements NumbersAPI {

    public double nthDigitOfPi(int digits) {
        return nthDigitOfX(Math.PI, digits);
    }

    public double nthDigitOfE(int digits) {
        return nthDigitOfX(Math.E, digits);
    }

    private double nthDigitOfX(double x, int digits) {
        return Math.floor(x * Math.pow(10, digits - 1)) / Math.pow(10, digits - 1);
    }

    public int getFibonacciSequenceIndex(int i) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        return getFibonacciSequence(i).get(i - 1);
    }

    private List<Integer> getFibonacciSequence(int i) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(1);
        int pos = 2;
        while (pos < i) {
            list.add(list.get(pos - 2) + list.get(pos - 1));
            pos++;
        }
        return list;
    }

    public List<Integer> getPrimeFactorization(int number) {
        List<Integer> list = new ArrayList<Integer>();
        // get all the even factors.
        while (number % 2 == 0) {
            number = number / 2;
            list.add(2);
        }
        //get all the odd factors.
        for (int i = 3; i <= Math.sqrt(number); i = i + 2) {
            while (number % i == 0) {
                list.add(i);
                number = number / i;
            }
        }
        //if number is prime
        if (number > 2)
            list.add(number);
        return list;
    }


}
