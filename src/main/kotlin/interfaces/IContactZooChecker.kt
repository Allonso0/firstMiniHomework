package org.example.interfaces

import org.example.classes.Animal

// Интерфейс IContactZooChecker определяет логику того, как животное будет проверяться для
// контактного зоопарка.
interface IContactZooChecker {
    fun isSuitableForContactZoo(animal: Animal): Boolean
}