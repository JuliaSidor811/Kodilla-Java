package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class BoardTestSuite {

    @Autowired
    Board board;

    @Test
    void testTaskAdd() {

        ArrayList<String> toDoList = (ArrayList<String>) board.getToDoList().getTasks();
        toDoList.add("Zadanie do zrobienia");

        ArrayList<String> inProgressList = (ArrayList<String>) board.getInProgressList().getTasks();
        inProgressList.add("Nowe zadanie w procesie");

        ArrayList<String> doneList = (ArrayList<String>) board.getDoneList().getTasks();
        doneList.add("Skonczone zadanie");

        assertEquals("Zadanie do zrobienia",toDoList.get(0));
        assertEquals("Nowe zadanie w procesie",inProgressList.get(0));
        assertEquals("Skonczone zadanie",doneList.get(0));




    }
}
