package com.example.tupicionario

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class BichosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bichos)

        val arrayBichos = resources.getStringArray(R.array.bichos)
        val listBichos = listOf(*arrayBichos)

    }
}