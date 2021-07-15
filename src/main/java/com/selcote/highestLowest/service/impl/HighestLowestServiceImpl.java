package com.selcote.highestLowest.service.impl;

import com.selcote.highestLowest.service.HighestLowestService;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

@Service
public class HighestLowestServiceImpl implements HighestLowestService {
    @Override
    public String highAndLow(String numbers) {

        String [] digits = numbers.split(" ");

        int[] digitsConverted = Stream.of(digits)
                                        .mapToInt(Integer::parseInt)
                                        .toArray();

        return digitsConverted[ digits.length - 1 ] + " " +  digitsConverted[ 0 ];
    }
}
