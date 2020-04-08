package com.example.tupicionario

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class BichosActivity : AppCompatActivity() {

    lateinit var textView: TextView

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bichos)

        val arrayBichos = resources.getStringArray(R.array.bichos)
        val listBichos = listOf(*arrayBichos)

        val root: LinearLayout = findViewById(R.id.rootBichos)

        for (bicho in listBichos) {
            textView = TextView(this)
            textView.setText(bicho)
            root.addView(textView)
        }
    }
}