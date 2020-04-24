package com.example.tupicionario

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_bichos.*

class BichosActivity : AppCompatActivity(), OnItemClickListener {

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bichos)

        val arrayBichos = resources.getStringArray(R.array.bichos)
        val arrayDescricao = resources.getStringArray(R.array.bichos_desc)
        val tamanhoLista = arrayBichos.size

        val listaCONVERTIDA = listaConvertida(tamanhoLista, arrayBichos, arrayDescricao)

        bichosRecycleView.adapter = ItemAdapter(listaCONVERTIDA, this)
        bichosRecycleView.layoutManager = LinearLayoutManager(this)



    }

    fun listaConvertida(tamanhoLista: Int, name: Array<String>, description: Array<String>): List<Item> {

        val listaDeItens = arrayListOf<Item>()

        val color = resources.getColor(R.color.bichos_categoria)

        for (i in 0 until tamanhoLista) {
            var item = Item(R.drawable.ic_bichos, name[i], description[i], color)
            listaDeItens += item
        }
        return listaDeItens
    }

    override fun onItemClick(itemList: Item, position: Int) {
        Toast.makeText(this, itemList.description, Toast.LENGTH_SHORT).show()
    }
}