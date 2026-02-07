package ru.nickolay.learningandrememberxmlversion.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.nickolay.learningandrememberxmlversion.data.ShopListRepositoryImpl
import ru.nickolay.learningandrememberxmlversion.domain.DeleteItemFromShopListUseCase
import ru.nickolay.learningandrememberxmlversion.domain.EditItemInShopListUseCase
import ru.nickolay.learningandrememberxmlversion.domain.GetShopListUseCase
import ru.nickolay.learningandrememberxmlversion.domain.ShopItem

class MainViewModel: ViewModel() {

    private val repository = ShopListRepositoryImpl()

    private val getShopItemListUseCase = GetShopListUseCase(repository)
    private val deleteShopItemUseCase = DeleteItemFromShopListUseCase(repository)
    private val editShopItemUseCase = EditItemInShopListUseCase(repository)

    val shopList = getShopItemListUseCase.getShopList()

    fun deleteShopItem(shopItem: ShopItem) {
        deleteShopItemUseCase.deleteShopItem(shopItem)
    }

    fun editShopItem(shopItem: ShopItem) {
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        editShopItemUseCase.editShopItem(newItem)
    }
}