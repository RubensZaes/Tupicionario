package com.example.tupicionario

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import android.widget.ListView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_plantas.*

class PlantasActivity : AppCompatActivity() {

    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plantas)

        val arrayPlantas = resources.getStringArray(R.array.plantas)
        val listPlantas = arrayListOf(*arrayPlantas)

        rootPlantas.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listPlantas)
    }
}
