package com.example.quiz

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var pytanie = listOf(
            "Który z wymienionych języków jest jezykiem obiektowym?",
            "ile kot ma łap?",
            "dokąd nocą tupta jeż")
        var pytania = listOf(
            "java",
            "python",
            "html",
            "1",
            "2",
            "4",
            "Do domu",
            "Do lasu",
            "Do nory"
        )
        var odpowiedzi = listOf(
            0,2,1
        )
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}