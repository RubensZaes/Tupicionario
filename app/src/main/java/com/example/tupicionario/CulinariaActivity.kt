package com.example.tupicionario

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_culinaria.*

class CulinariaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_culinaria)

        val arrayCulinaria = resources.getStringArray(R.array.culinaria)
        val arrayDescricao = resources.getStringArray(R.array.culinaria_desc)
        val tamanhoLista = arrayCulinaria.size

        val listaCONVERTIDA = listaConvertida(tamanhoLista, arrayCulinaria, arrayDescricao)

        culinariaRecycleView.adapter = ItemAdapter(listaCONVERTIDA)
        culinariaRecycleView.layoutManager = LinearLayoutManager(this)
    }

    fun listaConvertida(tamanhoLista: Int, name: Array<String>, description: Array<String>): List<Item> {

        val listaDeItens = arrayListOf<Item>()

        val color = resources.getColor(R.color.culinaria_categoria)

        for (i in 0 until tamanhoLista) {
            var item = Item(R.drawable.ic_culinaria, name[i], description[i], color)
            listaDeItens += item
        }
        return listaDeItens
    }
}
