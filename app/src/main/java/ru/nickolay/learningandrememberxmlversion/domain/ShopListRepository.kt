package ru.nickolay.learningandrememberxmlversion.domain

interface ShopListRepository {
    fun addShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun editShopeItem(shopItem: ShopItem)

    fun getShopeItem(shopItemId: Int): ShopItem

    fun getShopList(): List<ShopItem>
}