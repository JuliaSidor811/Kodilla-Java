package com.kodilla.testing.shape;

import com.kodilla.testing.shape.ShapeCollector;
import org.junit.jupiter.api.*;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Nested
    @DisplayName("Tests for adding and removing")
    class AddingOrRemoving{
        @Test
        void testAddFigure(){

            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Square(1);
            shapeCollector.addFigure(shape);
            Assertions.assertEquals(1,shapeCollector.figures.size());

        }

        @Test
        void testRemoveFigure(){

            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Square(1);
            shapeCollector.addFigure(shape);
            boolean result = shapeCollector.removeFigure(shape);
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, shapeCollector.figures.size());

        }
    }
    @Nested
    @DisplayName("The rest tests")
    class ShowOrGet {

        @Test
        void testGetFigure(){
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Square(1);
            shapeCollector.addFigure(shape);
            Shape retrievedShape;
            retrievedShape = shapeCollector.getFigure(0);
            Assertions.assertEquals(shape, retrievedShape);

        }


    }

}
