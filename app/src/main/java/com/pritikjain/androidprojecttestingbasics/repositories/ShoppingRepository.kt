package com.pritikjain.androidprojecttestingbasics.repositories

import androidx.lifecycle.LiveData
import com.pritikjain.androidprojecttestingbasics.data.local.ShoppingItem
import com.pritikjain.androidprojecttestingbasics.other.Resource
import com.pritikjain.androidprojecttestingbasics.remote.responses.ImageResponse

interface ShoppingRepository {

    suspend fun insertShoppingItem(shoppingItem: ShoppingItem)

    suspend fun deleteShoppingItem(shoppingItem: ShoppingItem)

    fun observeAllShoppingItems(): LiveData<List<ShoppingItem>>

    fun observeTotalPrice(): LiveData<Float>

    suspend fun searchForImage(imageQuery: String): Resource<ImageResponse>

}