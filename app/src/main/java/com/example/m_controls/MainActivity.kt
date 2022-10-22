package com.example.m_controls

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mails = arrayOf("Mail.ru", "Google", "GoGetLinks", "Pikabu", "Pr-Cy", "YouTube", "Plurrimi", "Yandex")

        val adapter = ArrayAdapter<String>(
            this, android.R.layout.simple_dropdown_item_1line, mails
        )

        var autoCompleteTextView = findViewById<AutoCompleteTextView>(R.id.autoCompleteTextView)
        autoCompleteTextView.setAdapter(adapter)
    }
}