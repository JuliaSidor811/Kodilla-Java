package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ArrayOperationsTestSuite {
    @Test
    void testGetAverage() {

        int[] givenArray = new int[10];
        int sum = 0;
        for (int i = 0; i < givenArray.length; i++) {
            int value = (int)(Math.random()*101);
            givenArray[i] = value;
            sum += value;
        }
        double expectedAvg = (double) sum/givenArray.length;
        double resultAvg = ArrayOperations.getAverage(givenArray);
       Assertions.assertEquals(expectedAvg,resultAvg);


    }

}
