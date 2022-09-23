package com.storeitems

class ProductDao {

    fun add(product: Product){
        products.add(product)
    }

    fun searchAll() : List<Product> {
        return products.toList()
    }

    companion object {
        private val products = mutableListOf<Product>()
    }

}