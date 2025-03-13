package com.taskmanager.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taskmanager.app.models.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}