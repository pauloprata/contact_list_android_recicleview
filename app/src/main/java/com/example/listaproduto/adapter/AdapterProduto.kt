package com.example.listaproduto.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.listaproduto.R
import com.example.listaproduto.model.Produto

class AdapterProduto(private val context: Context, private val produtos: MutableList<Produto>): RecyclerView.Adapter<AdapterProduto.ProdutoViewHolder>() {


    //criar o inflate
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProdutoViewHolder {
        val itemLista = LayoutInflater.from(context).inflate(R.layout.hardware,parent,false)
        val holder = ProdutoViewHolder(itemLista)
        return holder
    }

    override fun onBindViewHolder(holder: ProdutoViewHolder, position: Int) {
        holder.photo.setImageResource(produtos[position].photo)
        holder.nome.text = produtos[position].nome
        holder.descricao.text = produtos[position].descricao
        holder.preco.text = produtos[position].preco
    }

    override fun getItemCount(): Int = produtos.size

    inner class ProdutoViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        val photo = itemView.findViewById<ImageView>(R.id.fotoproduto)
        val nome = itemView.findViewById<TextView>(R.id.nomeproduto)
        val descricao = itemView.findViewById<TextView>(R.id.descricaoproduto)
        val preco = itemView.findViewById<TextView>(R.id.precoproduto)
    }


}