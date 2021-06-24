package com.selcote.highestLowest.service.impl;

import com.selcote.highestLowest.service.HighestLowestService;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

@Service
public class HighestLowestServiceImpl implements HighestLowestService {
    @Override
    public String highAndLow(String numbers) {
        String[] chrs = numbers.split(" ");

        int[] array = Stream.of(chrs)
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();

        return array[array.length - 1] + " " + array[0] ;
    }
}
