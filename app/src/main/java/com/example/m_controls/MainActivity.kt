package com.example.m_controls

import android.icu.util.Calendar
import android.os.Bundle
import android.widget.*
import android.widget.DatePicker.OnDateChangedListener
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun task8(){
        val fruits = arrayOf(
            "avocado", "pear", "nectarine",
            "banana","apple","orange",
            "apricot","lemon","lime",
            "pear","mango","pineapple")

        val autoCompleteTextView = findViewById<AutoCompleteTextView>(R.id.autoCompleteTextView2);

        ArrayAdapter(
            this,
            android.R.layout.simple_dropdown_item_1line, fruits )
            .also { adapter -> autoCompleteTextView.setAdapter(adapter) }
    }

    fun Task7(){
        var timePicker = findViewById<TimePicker>(R.id.timePicker)
        val today: Calendar = Calendar.getInstance()
        var textView = findViewById<TextView>(R.id.textView3)

        timePicker.setOnTimeChangedListener { _, hourOfDay, minute ->
            textView.setText("${hourOfDay}:${minute}")
        }
    }

    fun Task5(){
        val textView = findViewById<TextView>(R.id.textView4)
        val seekBar = findViewById<SeekBar>(R.id.seekBar)

        seekBar.setOnSeekBarChangeListener(
            object : SeekBar.OnSeekBarChangeListener {

                override fun onProgressChanged(
                    seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                    textView.text = "$progress"
                }

                override fun onStartTrackingTouch(seekBar: SeekBar) {
                    // Do nothing
                }

                override fun onStopTrackingTouch(seekBar: SeekBar) {
                    // Do nothing
                }
            })
    }

    fun Task4(){
        var textView = findViewById<TextView>(R.id.textView2)
        var radioButton1 = findViewById<RadioButton>(R.id.radioButton3)
        var radioButton2 = findViewById<RadioButton>(R.id.radioButton4)

        radioButton1.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked)
                textView.setText(radioButton1.text)
        }

        radioButton2.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked)
                textView.setText(radioButton2.text)
        }
    }

    fun Task3(){
        var toggleButton = findViewById<ToggleButton>(R.id.toggleButton)

        val text = "ААААА, зачем ты нажал!"

        val toast = Toast.makeText(applicationContext, text, Toast.LENGTH_SHORT)

        toggleButton.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked)
                toast.show()
        }
    }

    fun Task2(){
        var textView = findViewById<TextView>(R.id.textView)
        var checkBox1 = findViewById<CheckBox>(R.id.checkBox)
        var checkBox2 = findViewById<CheckBox>(R.id.checkBox3)

        checkBox1.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked)
                textView.setText("Java")
            else
                textView.setText("")
        }

        checkBox2.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked)
                textView.setText("JavaScript")
            else
                textView.setText("")
        }
    }

    fun Task1(){
        val mails = arrayOf("Mail.ru", "Google", "GoGetLinks", "Pikabu", "Pr-Cy", "YouTube", "Plurrimi", "Yandex")

        val adapter = ArrayAdapter<String>(
            this, android.R.layout.simple_dropdown_item_1line, mails
        )

        var autoCompleteTextView = findViewById<AutoCompleteTextView>(R.id.autoCompleteTextView)
        autoCompleteTextView.setAdapter(adapter)
    }
}