package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .forEach(System.out::println);

        OptionalDouble numbersAverageOp = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average();

        double average = 0;

        if(numbersAverageOp.isPresent()){
            average = numbersAverageOp.getAsDouble();
        }
        return average;
    }

}
