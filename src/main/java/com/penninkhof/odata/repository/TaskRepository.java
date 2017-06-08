package com.penninkhof.odata.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.penninkhof.odata.entities.Task;

public interface TaskRepository extends CrudRepository<Task, Integer> {

    //List<Task> findTask(String name);

}