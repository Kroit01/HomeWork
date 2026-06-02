package com.example.homework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlin.jvm.java

// Домашнее задание Спринт 3. Переходы между экранами

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val searchButton = findViewById<Button>(R.id.search1)
        val libraryButton = findViewById<Button>(R.id.library)
        val settingsButton = findViewById<Button>(R.id.setting1)


        // Переход на экран Поиска
        searchButton.setOnClickListener {
            val displayIntent = Intent(this, Search::class.java)
            startActivity(displayIntent)
        }

        // Переход на экран Медиатеки
        libraryButton.setOnClickListener {
            val displayIntent = Intent(this, Library::class.java)
            startActivity(displayIntent)
        }

// Переход на экран Настроек
        settingsButton.setOnClickListener {
            val displayIntent = Intent(this, Settings::class.java)
            startActivity(displayIntent)
        }
    }
}