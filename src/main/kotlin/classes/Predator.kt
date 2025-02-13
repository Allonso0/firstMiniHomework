package org.example.classes

// Абстрактный класс Predator представляет хищных животных.
// Наследует класс Animal.
abstract class Predator(
    foodConsumption: Int,
    name: String,
    species: String,
    health: Int
) : Animal(foodConsumption, name, species, health)