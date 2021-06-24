package com.selcote.highestLowest.controller;

import com.selcote.highestLowest.service.HighestLowestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

public class HighestLowestControllerIT {

    private final HighestLowestService highestLowestService;

    private final MockMvc restItemMockMvc;

    public HighestLowestControllerIT(
            HighestLowestService highestLowestService,
            MockMvc restItemMockMvc
    ) {

        this.highestLowestService = highestLowestService;
        this.restItemMockMvc = restItemMockMvc;
    }

    void getItem() throws Exception {
//        // Initialize the database
//        itemRepository.saveAndFlush(item);
//
//        // Get the item
//        restItemMockMvc
//                .perform(get(ENTITY_API_URL_ID, item.getId()))
//                .andExpect(status().isOk())
//                .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
//                .andExpect(jsonPath("$.id").value(item.getId().intValue()))
//                .andExpect(jsonPath("$.descriptionEngish").value(DEFAULT_DESCRIPTION_ENGISH))
//                .andExpect(jsonPath("$.quantity").value(DEFAULT_QUANTITY))
//                .andExpect(jsonPath("$.weight").value(DEFAULT_WEIGHT.doubleValue()))
//                .andExpect(jsonPath("$.value").value(DEFAULT_VALUE.doubleValue()))
//                .andExpect(jsonPath("$.countryOfOrigin").value(DEFAULT_COUNTRY_OF_ORIGIN));
    }
}
