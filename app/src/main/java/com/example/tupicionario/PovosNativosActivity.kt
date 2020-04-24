package com.example.tupicionario

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_povos_nativos.*

class PovosNativosActivity : AppCompatActivity(), OnItemClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_povos_nativos)

        val arrayPovosNativos = resources.getStringArray(R.array.povos_nativos)
        val arrayDescricao = resources.getStringArray(R.array.povos_nativos_desc)
        val tamanhoLista = arrayPovosNativos.size

        val listaCONVERTIDA = listaConvertida(tamanhoLista, arrayPovosNativos, arrayDescricao)

        povosNativosRecycleView.adapter = ItemAdapter(listaCONVERTIDA, this)
        povosNativosRecycleView.layoutManager = LinearLayoutManager(this)
    }

    fun listaConvertida(tamanhoLista: Int, name: Array<String>, description: Array<String>): List<Item> {

        val listaDeItens = arrayListOf<Item>()

        val color = resources.getColor(R.color.povos_nativos_categoria)

        for (i in 0 until tamanhoLista) {
            var item = Item(R.drawable.ic_povos_nativos, name[i], description[i], color)
            listaDeItens += item
        }
        return listaDeItens
    }

    override fun onItemClick(itemList: Item, position: Int) {
        Toast.makeText(this, itemList.description, Toast.LENGTH_SHORT).show()
    }
}
