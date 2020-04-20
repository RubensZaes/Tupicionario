package com.example.tupicionario

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import android.widget.ListView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_povos_nativos.*

class PovosNativosActivity : AppCompatActivity() {

    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_povos_nativos)

        val arrayPovosNativos = resources.getStringArray(R.array.povos_nativos)
        val listPovosNativos = arrayListOf(*arrayPovosNativos)

        rootPovosNativos.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listPovosNativos)
    }
}
