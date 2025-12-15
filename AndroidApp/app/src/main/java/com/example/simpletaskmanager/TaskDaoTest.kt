package com.example.simpletaskmanager

import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import com.example.simpletaskmanager.data.Task
import com.example.simpletaskmanager.data.TaskDatabase
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class TaskDaoTest {

    private lateinit var db: TaskDatabase

    @Before
    fun setup() {
        db = Room.inMemoryDatabaseBuilder(
            ApplicationProvider.getApplicationContext(),
            TaskDatabase::class.java
        ).allowMainThreadQueries().build()
    }

    @After
    fun closeDb() {
        db.close()
    }

    @Test
    fun insertTask_checkIfInserted() {
        val task = Task(title = "Test", description = "Desc")
        db.taskDao().insert(task)
        val tasks = db.taskDao().getAllTasks()
        assertEquals(1, tasks.size)
    }
}
