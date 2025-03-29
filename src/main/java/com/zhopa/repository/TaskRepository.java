package com.zhopa.repository;

import com.zhopa.model.Task;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface TaskRepository extends Neo4jRepository<Task, Long> {
}
