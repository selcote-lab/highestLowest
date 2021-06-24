package com.selcote.highestLowest.controller;

import com.selcote.highestLowest.service.HighestLowestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class HighestLowestController {

    private final Logger LOGGER = LoggerFactory.getLogger(HighestLowestController.class);

    private final HighestLowestService highestLowestService;


    public HighestLowestController(HighestLowestService highestLowestService) {
        this.highestLowestService = highestLowestService;
    }

    /**
     * {@code GET  /highestLowest/:numbers} : get the highest and lowest as a string.
     *
     * @param numbers as a string
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body String,
     * or with status {@code 400 (Bad request)}.
     */
    @GetMapping("/{numbers}")
    public String getCarrier(@PathVariable String numbers) {

        LOGGER.debug("REST request to get Higest and Lowest : {}", numbers);
        return highestLowestService.highAndLow(numbers);

    }
}
