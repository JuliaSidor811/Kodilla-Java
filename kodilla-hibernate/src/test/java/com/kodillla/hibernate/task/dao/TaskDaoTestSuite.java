package com.kodillla.hibernate.task.dao;

import com.kodillla.hibernate.task.Task;
import com.kodillla.hibernate.task.TaskFinancialDetails;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TaskDaoTestSuite {

    private static final String DESCRIPTION = "Test: Learn Hibernate";
    @Autowired
    private TaskDao taskDao;

    @Test
    void testTaskDaoSave() {

        Task task = new Task(DESCRIPTION, 7);
        taskDao.save(task);
        int id = task.getId();
        Optional<Task> readTask = taskDao.findById(id);
        assertTrue(readTask.isPresent());
        taskDao.deleteById(id);

    }
    @Test
    void testTaskDaoFindByDuration() {

        Task task = new Task(DESCRIPTION, 7);
        taskDao.save(task);
        int duration = task.getDuration();
        List<Task> readTasks = taskDao.findByDuration(duration);
        assertEquals(1, readTasks.size());
        int id = readTasks.get(0).getId();
        taskDao.deleteById(id);

    }
    @Test
    void testTaskDaoSaveWithFinancialDetails() {
        //Given
        Task task = new Task(DESCRIPTION, 30);
        task.setTaskFinancialDetails(new TaskFinancialDetails(new BigDecimal(120), false));

        //When
        taskDao.save(task);
        int id = task.getId();

        //Then
        assertNotEquals(0, id);

        //CleanUp
        taskDao.deleteById(id);
    }
}
