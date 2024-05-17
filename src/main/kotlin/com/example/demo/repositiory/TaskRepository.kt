package com.example.demo.repositiory

import com.example.demo.dto.Task
import org.springframework.stereotype.Repository

@Repository
class TaskRepository {
    val taskList: MutableList<Task> = mutableListOf()

    fun findAll() = taskList

    fun addTask(desc: String, title: String) {
        taskList.add(Task(desc, title))
    }
}