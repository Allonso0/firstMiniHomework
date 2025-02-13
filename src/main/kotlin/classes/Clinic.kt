package org.example.classes

// Класс Clinic проверяет здоровье животных перед их добавлением в зоопарк.
// Для этого используется метод isHealthyEnough. Животное добавляется в зоопарк,
// если уровень его здоровья >= 8.
class Clinic {
    fun isHealthyEnough(animal: Animal): Boolean {
        return animal.health >= 8
    }
}