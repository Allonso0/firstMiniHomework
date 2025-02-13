package org.example.classes

import org.example.interfaces.IContactZooChecker

// Класс ContactZooChecker, наследующий интерфейс IContactZooChecker проверяет
// с помощью метода isSuitableForContactZoo то, подходит ли животное для контактного зоопарка,
// т.е. травоядное ли оно и достаточный ли у него уровень доброты
class ContactZooChecker : IContactZooChecker {
    override fun isSuitableForContactZoo(animal: Animal): Boolean {
        return animal is Herbo && animal.kindnessLevel > 5
    }
}