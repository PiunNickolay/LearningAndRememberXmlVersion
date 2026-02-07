package ru.nickolay.learningandrememberxmlversion.domain

import androidx.lifecycle.LiveData

interface ShopListRepository {
    fun addShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun editShopeItem(shopItem: ShopItem)

    fun getShopeItem(shopItemId: Int): ShopItem

    fun getShopList(): LiveData<List<ShopItem>>
}