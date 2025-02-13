package org.example.classes

// Абстрактный класс Thing представляет все ВЕЩИ на балансе (столы и компы).
// Содержит единственное поле - типы предмета (либо "Computer", либо "Table").
abstract class Thing(
    val type: String
) : InventoryItem()