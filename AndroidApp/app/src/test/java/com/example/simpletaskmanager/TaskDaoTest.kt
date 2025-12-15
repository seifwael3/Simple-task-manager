package com.example.simpletaskmanager

import org.junit.Assert.assertTrue
import org.junit.Test

class TaskDaoTest {

    @Test
    fun insertTask_test() {
        val task = Task(name = "Test Task")
        assertTrue(task.name.isNotEmpty())
    }
}
