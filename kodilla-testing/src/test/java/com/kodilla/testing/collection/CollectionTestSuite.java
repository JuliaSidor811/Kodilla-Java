package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;

import org.junit.jupiter.api.*;

import java.util.*;


public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName("when given list is empty, " +
            "then exterminate should return empty list as well")
    @Test
    void testOddNumbersExterminatorEmptyList() {
        System.out.println("Empty List Test");
        List<Integer> givenList = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> result = oddNumbersExterminator.exterminate(givenList);
        Assertions.assertEquals(givenList, result);
    }

    @DisplayName("when given list is normal, " +
            "then exterminate should return list with only even numbers")
    @Test
    void testOddNumbersExterminatorNormalList() {
        System.out.println("Normal List Test");
        List<Integer> givenList = new ArrayList<>();
        for (int i = 0; i <= 4; i++) {
            givenList.add(i);
        }
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(0);
        expectedResult.add(2);
        expectedResult.add(4);
        List<Integer> result = oddNumbersExterminator.exterminate(givenList);
        Assertions.assertEquals(expectedResult, result);

    }
}
