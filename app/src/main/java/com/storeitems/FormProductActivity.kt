package com.storeitems

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.storeitems.databinding.ActivityFormProductBinding
import java.math.BigDecimal

class FormProductActivity : AppCompatActivity(){

    private val binding by lazy {
        ActivityFormProductBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        configuraBotaoSalvar()
    }

    private fun configuraBotaoSalvar() {
        val botaoSalvar = binding.activityFormularioProdutoBotaoSave
        val dao = ProductDao()
        botaoSalvar.setOnClickListener {
            val newProduct = createProduct()
            dao.add(newProduct)
            finish()
        }
    }

    private fun createProduct(): Product {
        val campoNome = binding.activityFormularioProdutoName
        val nome = campoNome.text.toString()
        val campoDescricao = binding.activityFormularioProdutoDescription
        val descricao = campoDescricao.text.toString()
        val campoValor = binding.activityFormularioProdutoPrice
        val valorEmTexto = campoValor.text.toString()
        val valor = if (valorEmTexto.isBlank()) {
            BigDecimal.ZERO
        } else {
            BigDecimal(valorEmTexto)
        }

        return Product(
            name = nome,
            description = descricao,
            price = valor
        )
    }

}