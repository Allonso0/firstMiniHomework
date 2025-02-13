package org.example.classes

import org.example.interfaces.IAlive

// Абстрактный класс Animal, который наследует интерфейс IAlive и класс InventoryItem.
// Представляет всех животных, включает в себя общие характеристики (кол-во потребляемой еды,
// имя, вид животного, уровень здоровья).
abstract class Animal(
    override val foodConsumption: Int,
    val name: String,
    val species: String,
    val health: Int
) : IAlive, InventoryItem()