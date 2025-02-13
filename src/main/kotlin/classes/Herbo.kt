package org.example.classes

// Абстрактный класс Herbo представляет травоядных животных с
// дополнительным полем - уровнем доброты. Наследует класс Animal.
abstract class Herbo(
    foodConsumption: Int,
    name: String,
    species: String,
    health: Int,
    val kindnessLevel: Int,
) : Animal(foodConsumption, name, species, health)