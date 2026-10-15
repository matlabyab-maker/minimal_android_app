package com.example.minima

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // ساخت یک نمای متنی ساده به صورت دستی (بدون نیاز به فایل XML در پوشه layout)
        val textView = TextView(this).apply {
            text = "Hello Minimal Android!"
            textSize = 24f
            setPadding(50, 50, 50, 50)
        }
        
        setContentView(textView)
    }
}
