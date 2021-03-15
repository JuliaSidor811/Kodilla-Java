package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {
    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> even = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 == 0) {
                even.add(num);
            }
        }
        return even;

    }
}
