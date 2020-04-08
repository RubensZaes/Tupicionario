package com.example.tupicionario

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView

class PovosNativosActivity : AppCompatActivity() {

    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_povos_nativos)

        val arrayPovosNativos = resources.getStringArray(R.array.povos_nativos)
        val listPovosNativos = arrayListOf(*arrayPovosNativos)

        val root: LinearLayout = findViewById(R.id.rootPovosNativos)

        for (povoNativo in listPovosNativos) {
            textView = TextView(this)
            textView.setText(povoNativo)
            root.addView(textView)
        }
    }
}
