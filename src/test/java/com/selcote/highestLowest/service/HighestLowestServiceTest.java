package com.selcote.highestLowest.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class HighestLowestServiceTest {

    @Autowired
    private  HighestLowestService highestLowestService;

    @Test
    public void test1() {

        assertEquals(
                "42 -9",
                highestLowestService.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4")
        );
    }

}
