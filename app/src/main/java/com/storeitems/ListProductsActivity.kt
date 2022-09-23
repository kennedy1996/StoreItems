package com.storeitems

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
        setContentView(R.layout.activity_products_list)





    }
}