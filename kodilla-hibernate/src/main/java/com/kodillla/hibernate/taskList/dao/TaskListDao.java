package com.kodillla.hibernate.taskList.dao;


import com.kodillla.hibernate.taskList.TaskList;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TaskListDao extends CrudRepository<TaskList, Integer> {
    List<TaskList> findByListName(String listName);
}
