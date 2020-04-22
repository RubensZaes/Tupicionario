package com.example.tupicionario

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter(private val itemList: List<Item>) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemIconeImageView: ImageView = itemView.findViewById(R.id.itemIconeImageView)
        val itemTituloTextView: TextView = itemView.findViewById(R.id.itemTituloTextView)
        val itemDescricaoTextView: TextView = itemView. findViewById(R.id.itemDescricaoTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val currentItem = itemList[position]

        holder?.itemIconeImageView?.setImageResource(currentItem.imageResource)
        holder?.itemTituloTextView?.text = currentItem.title
        holder?.itemDescricaoTextView?.text = currentItem.description
    }

    override fun getItemCount(): Int = itemList.size

}