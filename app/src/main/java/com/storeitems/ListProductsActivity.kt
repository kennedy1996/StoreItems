package com.storeitems

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ListProductsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products_list)
    }
}