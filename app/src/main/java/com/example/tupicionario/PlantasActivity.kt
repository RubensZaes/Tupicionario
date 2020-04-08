package com.example.tupicionario

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView

class PlantasActivity : AppCompatActivity() {

    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plantas)

        val arrayPlantas = resources.getStringArray(R.array.plantas)
        val listPlantas = arrayListOf(*arrayPlantas)

        val root: LinearLayout = findViewById(R.id.rootPlantas)

        for (planta in listPlantas) {
            textView = TextView(this)
            textView.setText(planta)
            root.addView(textView)
        }
    }
}
