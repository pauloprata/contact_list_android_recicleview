package com.example.listaproduto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listaproduto.adapter.AdapterProduto
import com.example.listaproduto.model.Produto

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar!!.hide()

        val recycleview_produto = findViewById<RecyclerView>(R.id.recycl_produto)
        recycleview_produto.layoutManager = LinearLayoutManager(this)
        recycleview_produto.setHasFixedSize(true)

        //configurando o adapter

        val listaProdutos: MutableList<Produto> = mutableListOf()
        val adapterProduto = AdapterProduto(this, listaProdutos)
        recycleview_produto.adapter = adapterProduto

        val produto1 = Produto(
            R.drawable.ssd,
            "SSD SanDisk Plus 480GB",
            "Confiável, rápido e muita capacidade. A SanDisk, pioneira em tecnologias de armazenamento de estado sólido é a marca de confiança dos profissionais da área, oferece maior velocidade e desempenho com o SanDisk SSD Plus.",
            "R$ 450,00"


        )
        listaProdutos.add(produto1)
        val produto2= Produto(
            R.drawable.processador,
            "Intel Core i5 10400F",
            "Os novos processadores da 10ª geração oferecem atualizações de desempenho incríveis para melhorar a produtividade e proporcionar entretenimento surpreendente.",
            "R$ 1100 "


        )
        listaProdutos.add(produto2)

        val produto3 = Produto(
            R.drawable.memoria,
            "Memória Ram Corsair  8GB DDR4",
            " Memória Corsair Vengeance LPX, 8GB, 2666MHz, DDR4, C16, Preto.",
            "R$ 350 "


        )
        listaProdutos.add(produto3)

        val produto4 = Produto(
            R.drawable.placadevideo,
            "GeForce RTX 3090 24GB",
            " Os blocos de construção para a GPU mais rápida e eficiente do mundo, o novo Ampere SM traz 2X a taxa de transferência do FP32 e maior eficiência de energia",
            "R$ 18.000,00"


        )
        listaProdutos.add(produto4)

        val produto5 = Produto(
            R.drawable.teclado,
            "Teclado Mecanico Gamer T-Dagger Corvette",
            " Teclado Mecânico Gamer T-Dagger Corvette, LED Rainbow, Switch Outemu DIY Blue, ABNT2 - T-TGK302 -BL (PT-BLUE).",
            "R$ 300,00"


        )
        listaProdutos.add(produto5)

        val produto6 = Produto(
            R.drawable.gabinete,
            "Gabinete Gamer",
            " A série Carbide SPEC-DELTA RGB é uma caixa ATX de torre média de vidro temperado com estilo angular impressionante, fluxo de ar potente e três ventiladores de refrigeração RGB incluídos.",
            "R$ 800,00"


        )
        listaProdutos.add(produto6)
    }

}