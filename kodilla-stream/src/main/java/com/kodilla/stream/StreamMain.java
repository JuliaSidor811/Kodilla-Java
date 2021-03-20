package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifer;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;
import com.kodilla.stream.reference.FunctionalBeautifer;


import java.util.Locale;

public class StreamMain {
    public static void main(String[] args) {
        Processor processor = new Processor();
        Executor codeToExecute = () -> System.out.println("This is an example text.");
        processor.execute(codeToExecute);

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        expressionExecutor.executeExpression(10,5,(a, b) -> a + b);
        expressionExecutor.executeExpression(10,5,(a, b) -> a - b);
        expressionExecutor.executeExpression(10,5,(a, b) -> a * b);
        expressionExecutor.executeExpression(10,5,(a, b) -> a / b);
        //---------------------------------------------------------------
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
        //----------------------------------------------------------------
        PoemBeautifer poemBeautifer = new PoemBeautifer();
        poemBeautifer.beautify("RaBarBar",(text) -> text.toUpperCase() + "ABC");
        poemBeautifer.beautify("JaKis tEKst", (text) -> "!"+text.toLowerCase()+"!");
        poemBeautifer.beautify("tHiS iS AN example", FunctionalBeautifer::changeCase);
        poemBeautifer.beautify("Kamil Slimak", FunctionalBeautifer::reverse);
        //------------------------------------------------------------------
        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);


    }
}
