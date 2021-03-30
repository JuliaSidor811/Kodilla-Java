package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SecondChallangeSuite {
    @Test
    void testProbablyIWillThrowExceptionCaseX(){
        SecondChallange secondChallange = new SecondChallange();
        assertAll(
                () -> assertThrows(Exception.class, () -> secondChallange.probablyIWillThrowException(2,0)),
                () -> assertThrows(Exception.class, () -> secondChallange.probablyIWillThrowException(0.99,0)),
                () -> assertDoesNotThrow(() -> secondChallange.probablyIWillThrowException(1,0))
        );

    }
    @Test
    void ProbablyIWillThrowExceptionCaseY(){
        SecondChallange secondChallange = new SecondChallange();
        assertAll(
                () -> assertThrows(Exception.class, ()-> secondChallange.probablyIWillThrowException(1,1.5)),
                () -> assertDoesNotThrow(() -> secondChallange.probablyIWillThrowException(1,1.6))
        );
    }
}
