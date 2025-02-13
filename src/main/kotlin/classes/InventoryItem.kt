package org.example.classes

import org.example.interfaces.IInventory

// Абстрактный класс InventoryItem - это базовый типа для всех объектов, которые
// можно добавить на баланс зоопарка. Он содержит в себе генерацию ID - увеличивающийся счетчик.
abstract class InventoryItem : IInventory {
    override val id: Int = cntIncrease()

    companion object {
        private var cnt = 0
        private fun cntIncrease() : Int {
            return ++cnt
        }
    }
}