package com.kodillla.hibernate.tasklist.dao;

import com.kodillla.hibernate.task.Task;
import com.kodillla.hibernate.task.TaskFinancialDetails;
import com.kodillla.hibernate.taskList.TaskList;
import com.kodillla.hibernate.taskList.dao.TaskListDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.util.List;

@SpringBootTest
public class TaskListDaoTestSuite {

    private static final String LISTNAME = "Nazwa listy";
    private static final String DESCRIPTION = "Opis";

    @Autowired
    private TaskListDao taskListDao;

    @Test
    void testTaskListDaoFindByListName() {

        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
        taskListDao.save(taskList);
        String listname = taskList.getListName();
        List<TaskList> readTaskList = taskListDao.findByListName(listname);
        assertEquals(1, readTaskList.size());
        int id = readTaskList.get(0).getId();
        taskListDao.deleteById(id);

    }
    @Test
    void testTaskListDaoSaveWithTasks() {
        //Given
        Task task = new Task("Test: Learn Hibernate", 14);
        Task task2 = new Task("Test: Write some entities", 3);
        TaskFinancialDetails tfd = new TaskFinancialDetails(new BigDecimal(20), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10), false);
        task.setTaskFinancialDetails(tfd);
        task2.setTaskFinancialDetails(tfd2);
        TaskList taskList = new TaskList(LISTNAME, "ToDo tasks");
        taskList.getTasks().add(task);
        taskList.getTasks().add(task2);
        task.setTaskList(taskList);
        task2.setTaskList(taskList);

        //When
        taskListDao.save(taskList);
        int id = taskList.getId();

        //Then
        assertNotEquals(0, id);

        //CleanUp
        taskListDao.deleteById(id);
    }



}
