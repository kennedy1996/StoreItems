package com.storeitems

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.storeitems.databinding.ActivityProductsListBinding

class ListProductsActivity : AppCompatActivity() {

    private val dao = ProductDao()
    private val adapter = ListProductsAdapter(context = this, produtos = dao.searchAll())
    private val binding by lazy {
        ActivityProductsListBinding.inflate(layoutInflater)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        configuraRecyclerView()
        configuraFab()
    }

    override fun onResume() {
        super.onResume()
        adapter.update(dao.searchAll())
    }

    private fun configuraFab() {
        val fab = binding.activityProductsListFab
        fab.setOnClickListener {
            vaiParaFormularioProduto()
        }
    }

    private fun vaiParaFormularioProduto() {
        val intent = Intent(this, FormProductActivity::class.java)
        startActivity(intent)
    }

    private fun configuraRecyclerView() {
        val recyclerView = binding.activityProductsListRecyclerview
        recyclerView.adapter = adapter
    }
}