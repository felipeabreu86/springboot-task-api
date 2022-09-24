package com.book.todo.mock;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;

import com.book.todo.entity.Task;

public class TaskMock {

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static Page<Task> createTasks() {

        List<Task> taskList = new ArrayList<>();
        Task task1 = new Task();
        task1.setId(Integer.toUnsignedLong(1));
        task1.setName("Tarefa 1");
        task1.setDescription("Descrição da tarefa 1");

        Task task2 = new Task();
        task2.setId(Integer.toUnsignedLong(2));
        task2.setName("Tarefa 2");
        task2.setDescription("Descrição da tarefa 2");

        taskList.add(task1);
        taskList.add(task2);
        Page<Task> pagedResponse = new PageImpl(taskList);
        return pagedResponse;
    }

}
