package com.example.tupicionario

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var bichosTextView: TextView
    private lateinit var culinariaTextView: TextView
    private lateinit var plantasTextView: TextView
    private lateinit var povosNativosTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bichosTextView = findViewById(R.id.bichosTextView)
        bichosTextView.setOnClickListener(View.OnClickListener { callActivityBichos() })

        culinariaTextView = findViewById(R.id.culinariaTextView)
        culinariaTextView.setOnClickListener(View.OnClickListener { callactivityCulinaria() })

        plantasTextView = findViewById(R.id.plantasTextView)
        plantasTextView.setOnClickListener(View.OnClickListener { callActivityPlantas() })

        povosNativosTextView = findViewById(R.id.povosNativosTextView)
        povosNativosTextView.setOnClickListener(View.OnClickListener { callActivityPovosNativos() })

    }

    private fun callActivityBichos() {
        val intent = Intent(this, BichosActivity::class.java)
        startActivity(intent)
    }

    private fun callactivityCulinaria() {
        val intent = Intent(this, CulinariaActivity::class.java)
        startActivity(intent)
    }

    private fun callActivityPlantas() {
        val intent = Intent(this, PlantasActivity::class.java)
        startActivity(intent)
    }

    private fun callActivityPovosNativos() {
        val intent = Intent(this, PovosNativosActivity::class.java)
        startActivity(intent)
    }
}
