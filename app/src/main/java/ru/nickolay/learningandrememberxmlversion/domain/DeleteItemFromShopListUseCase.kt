package ru.nickolay.learningandrememberxmlversion.domain

class DeleteItemFromShopListUseCase(private val repository: ShopListRepository) {
    fun deleteShopItem(shopItem: ShopItem) {
        repository.deleteShopItem(shopItem)
    }
}