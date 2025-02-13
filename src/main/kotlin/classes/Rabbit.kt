package org.example.classes

// Класс Rabbit представляет кроликов.
// Наследует класс Herbo, т.к. кролики - травоядные.
class Rabbit(
    foodConsumption: Int,
    name: String,
    health: Int,
    kindnessLevel: Int
) : Herbo(foodConsumption, name, "Rabbit", health, kindnessLevel)