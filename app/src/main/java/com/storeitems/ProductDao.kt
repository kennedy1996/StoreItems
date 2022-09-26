package com.storeitems

import java.math.BigDecimal

class ProductDao {

    fun add(product: Product){
        products.add(product)
    }

    fun searchAll() : List<Product> {
        return products.toList()
    }

    companion object {
        private val products = mutableListOf<Product>(
            Product("Fruit Salad", "Orange and Apple", BigDecimal("19.69"))
        )
    }

}