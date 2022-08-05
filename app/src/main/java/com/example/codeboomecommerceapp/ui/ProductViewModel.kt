package com.example.codeboomecommerceapp.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.codeboomecommerceapp.db.ProductModel
import com.example.codeboomecommerceapp.repository.ProductRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ProductViewModel(
    val repository: ProductRepository,
) : ViewModel() {

    fun insertProduct(product: ProductModel) = viewModelScope.launch {
        repository.insertProduct(product)
    }

    fun deleteProduct(product: ProductModel) = viewModelScope.launch {
        repository.deleteProduct(product)
    }

    fun getAllProducts() = repository.getAllProduct()

    fun isExits(id:String)=repository.isExits(id)

}