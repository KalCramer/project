package com.cramer.project.numbers.client;

import com.cramer.project.numbers.api.NumbersAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NumbersClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(NumbersClient.class);


    public NumbersClient(NumbersAPI n) {
        LOGGER.info(n.getPrimeFactorization(231).toString());
    }


}
