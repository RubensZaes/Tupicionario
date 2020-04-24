package com.example.tupicionario

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_plantas.*

class PlantasActivity : AppCompatActivity(), OnItemClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plantas)

        val arrayPlantas = resources.getStringArray(R.array.plantas)
        val arrayDescricao = resources.getStringArray(R.array.plantas_desc)
        val tamanhoLista = arrayPlantas.size

        val listaCONVERTIDA = listaConvertida(tamanhoLista, arrayPlantas, arrayDescricao)

        plantasRecycleView.adapter = ItemAdapter(listaCONVERTIDA, this)
        plantasRecycleView.layoutManager = LinearLayoutManager(this)
    }

    fun listaConvertida(tamanhoLista: Int, name: Array<String>, description: Array<String>): List<Item> {

        val listaDeItens = arrayListOf<Item>()

        val color = resources.getColor(R.color.plantas_categoria)

        for (i in 0 until tamanhoLista) {
            var item = Item(R.drawable.ic_plantas, name[i], description[i], color)
            listaDeItens += item
        }
        return listaDeItens
    }

    override fun onItemClick(itemList: Item, position: Int) {
        Toast.makeText(this, itemList.description, Toast.LENGTH_SHORT).show()
    }
}
