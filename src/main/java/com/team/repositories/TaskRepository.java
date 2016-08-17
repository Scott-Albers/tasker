package com.team.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.team.models.Task;

public interface TaskRepository extends PagingAndSortingRepository<Task, Integer> { // Task is the model, Integer is the type of the primary key
}
