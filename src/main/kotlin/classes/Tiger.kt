package org.example.classes

// Класс Tiger представляет тигров.
// Наследует класс Predator, т.к. тигры - хищники.
class Tiger(
    foodConsumption: Int,
    name: String,
    health: Int
) : Predator(foodConsumption, name, "Tiger", health)