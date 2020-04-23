package com.example.tupicionario

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_bichos.*

class BichosActivity : AppCompatActivity() {

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bichos)

        val arrayBichos = resources.getStringArray(R.array.bichos)
        val arrayDescricao = resources.getStringArray(R.array.bichos_desc)
        val tamanhoLista = arrayBichos.size

        val listaCONVERTIDA = listaConvertida(tamanhoLista, arrayBichos, arrayDescricao)

        bichosRecycleView.adapter = ItemAdapter(listaCONVERTIDA)
        bichosRecycleView.layoutManager = LinearLayoutManager(this)
    }

    fun listaConvertida(tamanhoLista: Int, name: Array<String>, description: Array<String>): List<Item> {

        val listaDeItens = arrayListOf<Item>()

        for (i in 0 until tamanhoLista) {
            var item = Item(R.drawable.ic_bichos, name[i], description[i])
            listaDeItens += item
        }
        return listaDeItens
    }
}