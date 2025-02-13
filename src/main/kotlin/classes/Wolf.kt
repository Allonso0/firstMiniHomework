package org.example.classes

// Класс Wolf представляет тигров.
// Наследует класс Predator, т.к. волки - хищники.
class Wolf(
    foodConsumption: Int,
    name: String,
    health: Int
) : Predator(foodConsumption, name, "Wolf", health)