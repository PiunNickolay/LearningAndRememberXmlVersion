package ru.nickolay.learningandrememberxmlversion.domain

class AddItemInShopListUseCase(private val repository: ShopListRepository) {
    fun addShopItem(shopeItem: ShopItem) {
        repository.addShopItem(shopeItem)
    }
}