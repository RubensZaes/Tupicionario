package com.example.tupicionario

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class PovosNativosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_povos_nativos)

        val arrayPovosNativos = resources.getStringArray(R.array.povos_nativos)
        val listPovosNativos = arrayListOf(*arrayPovosNativos)
    }
}