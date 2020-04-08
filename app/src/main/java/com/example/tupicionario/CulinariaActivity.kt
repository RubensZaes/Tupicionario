package com.example.tupicionario

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView

class CulinariaActivity : AppCompatActivity() {

    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_culinaria)

        val arrayCulinaria = resources.getStringArray(R.array.culinaria)
        val listCulinaria = arrayListOf(*arrayCulinaria)

        val root: LinearLayout = findViewById(R.id.rootCulinaria)

        for (culinaria in listCulinaria) {
            textView = TextView(this)
            textView.setText(culinaria)
            root.addView(textView)
        }

    }
}
