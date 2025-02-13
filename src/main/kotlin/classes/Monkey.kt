package org.example.classes

// Класс Monkey представляет обезьян.
// Наследует класс Herbo, т.к. обезьяны - травоядные.
class Monkey(
    foodConsumption: Int,
    name: String,
    health: Int,
    kindnessLevel: Int
) : Herbo(foodConsumption, name, "Monkey", health, kindnessLevel)