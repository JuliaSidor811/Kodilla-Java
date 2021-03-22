package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class WorldTestSuite {
    @Test
    void testGetPeopleQuantity(){

        Country c1 = new Country("Poland", new BigDecimal("38000000"));
        Country c2 = new Country("Italy", new BigDecimal("60397785"));
        Continent continent1 = new Continent("Europe");
        continent1.addCountry(c1);
        continent1.addCountry(c2);

        Country c3 = new Country("Thailand", new BigDecimal("69927023"));
        Country c4 = new Country("South Korea", new BigDecimal("51301104"));
        Continent continent2 = new Continent("Asia");
        continent2.addCountry(c3);
        continent2.addCountry(c4);

        World world = new World();
        world.addContinent(continent1);
        world.addContinent(continent2);

        BigDecimal totalPeopleQuantity = world.getPeopleQuantity();
        BigDecimal expectedPeopleQuantity = new BigDecimal("219625912");
        assertEquals(totalPeopleQuantity,expectedPeopleQuantity);


    }
}
