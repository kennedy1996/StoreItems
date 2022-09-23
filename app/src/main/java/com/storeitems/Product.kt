package com.storeitems

import java.math.BigDecimal

data class Product(
    val name: String,
    val description: String,
    val price: BigDecimal
)