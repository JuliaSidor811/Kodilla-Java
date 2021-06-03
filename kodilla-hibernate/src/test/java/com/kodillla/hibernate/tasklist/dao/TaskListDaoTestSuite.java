package com.kodillla.hibernate.tasklist.dao;

import com.kodillla.hibernate.taskList.TaskList;
import com.kodillla.hibernate.taskList.dao.TaskListDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
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


}
