
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

    public int nthPrime(int n) {
        int candidate, count;
        for (candidate = 2, count = 0; count < n; ++candidate) {
            if (isPrime(candidate)) {
                ++count;
            }
        }
        return candidate - 1;
    }

    // https://stackoverflow.com/questions/9625663/calculating-and-printing-the-nth-prime-number
    public boolean isPrime(int n) {
        if (n % 2 == 0) return n == 2;
        if (n % 3 == 0) return n == 3;
        int step = 4, m = (int) Math.sqrt(n) + 1;
        for (int i = 5; i < m; step = 6 - step, i += step) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private double roundMoney(double x) {
        return Math.round(x * 100.0) / 100.0;
    }

    public double costOfTiling(double width, double height, double tileCost) {
        return roundMoney(width * height * tileCost);
    }

    public double mortgageMonthlyPayments(double morgage, double rate, int years) {
        return roundMoney((morgage * rate / 12) / (1 - Math.pow(1 + (rate / 12), -years * 12)));
    }

}
