package com.kodillla.hibernate.task.dao;

import com.kodillla.hibernate.task.Task;
import org.junit.jupiter.api.Test;

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
}
