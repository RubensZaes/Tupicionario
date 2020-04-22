package com.example.tupicionario

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import android.widget.ListView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_culinaria.*

class CulinariaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_culinaria)

        val arrayCulinaria = resources.getStringArray(R.array.culinaria)
        val listCulinaria = arrayListOf(*arrayCulinaria)

        rootCulinaria.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listCulinaria)

    }
}
