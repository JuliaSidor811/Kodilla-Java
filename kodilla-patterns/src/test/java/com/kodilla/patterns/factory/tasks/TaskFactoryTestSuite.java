package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {
     @Test
    void testFactoryShoppingTask(){

         TaskFactory taskFactory = new TaskFactory();
         Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOP);

         assertEquals("Shopping Task", shoppingTask.getTaskName());
         assertEquals("Buy: Water x 100.0", shoppingTask.executeTask());
     }
     @Test
    void testFactoryPaintingTask(){
         TaskFactory taskFactory = new TaskFactory();
         Task paintingTask = taskFactory.makeTask(TaskFactory.PAINT);
         paintingTask.executeTask();
         assertEquals("Painting Task", paintingTask.getTaskName());
         assertEquals(true, paintingTask.isTaskExecuted());
     }

     @Test
    void testFactoryDrivingTask(){
         TaskFactory taskFactory = new TaskFactory();
         Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVE);
         assertEquals(false, drivingTask.isTaskExecuted());
         assertEquals("Drive to: Berlin using: car", drivingTask.executeTask());
     }
}
