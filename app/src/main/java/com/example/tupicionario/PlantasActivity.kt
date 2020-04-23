package com.example.tupicionario

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_plantas.*

class PlantasActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plantas)

        val arrayPlantas = resources.getStringArray(R.array.plantas)
        val arrayDescricao = resources.getStringArray(R.array.plantas_desc)
        val tamanhoLista = arrayPlantas.size

        val listaCONVERTIDA = listaConvertida(tamanhoLista, arrayPlantas, arrayDescricao)

        plantasRecycleView.adapter = ItemAdapter(listaCONVERTIDA)
        plantasRecycleView.layoutManager = LinearLayoutManager(this)
    }

    fun listaConvertida(tamanhoLista: Int, name: Array<String>, description: Array<String>): List<Item> {

        val listaDeItens = arrayListOf<Item>()

        for (i in 0 until tamanhoLista) {
            var item = Item(R.drawable.ic_plantas, name[i], description[i])
            listaDeItens += item
        }
        return listaDeItens
    }
}
