package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BigMacTestSuite {
    @Test
    void testBigMacNew(){
        BigMac bigMac = new BigMac.BigMacBuilder()
                .roll("sesame")
                .sauce("berbecue")
                .burgers(2)
                .ingredients("onion")
                .ingredients("cucumber")
                .ingredients("champignon mushroom")
                .ingredients("cheese")
                .build();

        System.out.println(bigMac);

        int howManyIngredients = bigMac.getIngredients().size();

        assertEquals(4, howManyIngredients);

    }
}
