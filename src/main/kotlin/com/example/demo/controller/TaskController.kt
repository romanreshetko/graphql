package com.example.demo.controller

import com.example.demo.dto.Task
import com.example.demo.repositiory.TaskRepository
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.MutationMapping
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller

@Controller
class TaskController(val taskRepository: TaskRepository) {
    @QueryMapping
    fun findAll() : List<Task> {
        return taskRepository.findAll()
    }

    @MutationMapping
    fun createTask(@Argument desc: String, @Argument title: String) {
        taskRepository.addTask(desc, title)
    }
}