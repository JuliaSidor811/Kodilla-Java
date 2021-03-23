package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ArrayOperationsTestSuite {
    @Test
    void testGetAverage() {

        int[] givenArray = {1,4,3,2};
        double expectedAvg = 2.5;
        double resultAvg = ArrayOperations.getAverage(givenArray);
         Assertions.assertEquals(expectedAvg,resultAvg);


    }

}
