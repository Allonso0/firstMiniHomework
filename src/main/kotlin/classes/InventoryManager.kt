package org.example.classes

import org.example.interfaces.IInventory

// Класс InventoryManager, который управляет списком объектов на балансе.
// Внутри содержит список всех объектов на балансе и методы по добавлению этих объектов
// и получению этого списка.
class InventoryManager {
    private val inventory = mutableListOf<IInventory>()

    fun addItem(item: IInventory) {
        inventory.add(item)
    }

    fun getItems(): List<IInventory> {
        return inventory.toList()
    }
}