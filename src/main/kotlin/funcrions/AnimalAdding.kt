package org.example.funcrions

import org.example.classes.*

// Функция для добавления животного на баланс зоопарка.
fun addAnimal(zoo: Zoo) {
    println("Пожалуйста, заполните информацию о животном")
    println("Тип животного (1 - травоядное, 2 - хищник):")
    val type = readLine()?.toIntOrNull() ?: return

    val species = when (type) {
        1 -> {
            println("Вид животного (1 - обезьяна, 2 - кролик):")
            when (readLine()?.toIntOrNull()) {
                1 -> "Monkey"
                2 -> "Rabbit"
                else -> {
                    println("Неверный ввод!")
                    return
                }
            }
        }
        2 -> {
            println("Вид животного (1 - тигр, 2 - волк):")
            when (readLine()?.toIntOrNull()) {
                1 -> "Tiger"
                2 -> "Wolf"
                else -> {
                    println("Неверный ввод!")
                    return
                }
            }
        }
        else -> return
    }

    println("Имя:")
    val name = readLine() ?: return

    println("Потребление еды (кг):")
    val food = readLine()?.toIntOrNull() ?: return

    println("Уровень здоровья (1-10):")
    val health = readLine()?.toIntOrNull() ?: return

    if (health < 1 || health > 10) {
        println("Неверный ввод!")
        return
    }

    val animal = when (species) {
        "Monkey", "Rabbit" -> {
            println("Уровень доброты (1-10):")
            val kindness = readLine()?.toIntOrNull() ?: return

            if (kindness < 1 || kindness > 10) {
                println("Неверный ввод!")
                return
            }

            when (species) {
                "Monkey" -> Monkey(food, name, health, kindness)
                else -> Rabbit(food, name, health, kindness)
            }
        }
        else -> when (species) {
            "Tiger" -> Tiger(food, name, health)
            else -> Wolf(food, name, health)
        }
    }

    zoo.addAnimal(animal)
}