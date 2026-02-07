package ru.nickolay.learningandrememberxmlversion.domain

class EditItemInShopListUseCase(private val repository: ShopListRepository) {
    fun editShopItem(shopItem: ShopItem){
        repository.editShopeItem(shopItem)
    }
}