package com.example.app_dio

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val paragraphs = listOf(R.string.paragrafo_1, R.string.paragrafo_2, R.string.paragrafo_3, R.string.paragrafo_4, R.string.paragrafo_5)

        val paragraphTextView = findViewById<TextView>(R.id.paragraph)
        val randomParagraph = paragraphs.random()
        paragraphTextView.setText(randomParagraph)
    }
}