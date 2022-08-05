package com.example.layoutworkout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.layoutworkout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var activityMainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)

//        val myButton: Button = findViewById(R.id.button)
//        myButton.setOnClickListener { changeText() }

        activityMainBinding.button.setOnClickListener { changeText() }
    }

    private fun changeText() {
//        val myTextView: TextView = findViewById(R.id.textView)
//        myTextView.text = "Data Binding"
        activityMainBinding.textView.text = "Data Binding"

    }
}