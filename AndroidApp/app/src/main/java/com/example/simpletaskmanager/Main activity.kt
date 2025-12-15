package com.example.simpletaskmanager

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MainScreen {
                val intent = Intent(this, SecondActivity::class.java)
                startActivity(intent)
            }
        }
    }
}

@Composable
fun MainScreen(onNavigate: () -> Unit) {
    Button(onClick = onNavigate) {
        Text(text = "Go To Second Screen")
    }
}

@Preview
@Composable
fun PreviewMain() {
    MainScreen {}
}
