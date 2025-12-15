package com.example.simpletaskmanager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.simpletaskmanager.data.Task
import com.example.simpletaskmanager.data.TaskDatabase
import kotlinx.android.synthetic.main.activity_add_edit_task.*

class AddEditTaskActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_edit_task)

        val db = TaskDatabase.getDatabase(this)

        btnSave.setOnClickListener {
            val task = Task(
                title = edtTitle.text.toString(),
                description = edtDescription.text.toString()
            )
            db.taskDao().insert(task)
            finish()
        }
    }
}
