package com.example.tupicionario

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bichosTextView.setOnClickListener { callActivityBichos() }
        culinariaTextView.setOnClickListener { callactivityCulinaria() }
        plantasTextView.setOnClickListener {callActivityPlantas() }
        povosNativosTextView.setOnClickListener { callActivityPovosNativos() }

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

    data class Item (val titulo: String, val descricao: String, val imagem: Int)
}
