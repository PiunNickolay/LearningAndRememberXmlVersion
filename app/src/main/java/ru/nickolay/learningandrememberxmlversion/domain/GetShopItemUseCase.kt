package ru.nickolay.learningandrememberxmlversion.domain

class GetShopItemUseCase(private val repository: ShopListRepository) {
    fun getShopItem(shopItemId: Int): ShopItem {
        return repository.getShopeItem(shopItemId)
    }
}