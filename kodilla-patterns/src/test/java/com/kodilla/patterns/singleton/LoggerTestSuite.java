package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void log(){
        logger = Logger.ISTANCE;
        logger.log("przykladowy tekst");
    }
    @Test
    void testGetLastLog(){
        String lastLog = logger.getLastLog();
        assertEquals("przykladowy tekst", lastLog);
    }
}
