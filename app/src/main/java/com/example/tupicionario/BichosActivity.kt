package com.example.tupicionario

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_bichos.*

class BichosActivity : AppCompatActivity() {

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bichos)

        val arrayBichos = resources.getStringArray(R.array.bichos)
        val listBichos = listOf(*arrayBichos)

        rootBichos.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listBichos)

    }
}