package org.example.funcrions

import org.example.classes.Animal
import org.example.classes.Thing
import org.example.classes.Zoo

// Функция для отображения списка животных, подходящих для
// отправки в контактный зоопарк.
fun displayContactZooList(zoo: Zoo) {
    val animals = zoo.getContactZooAnimals()
    if (animals.isEmpty()) {
        println("Нет подходящих для контактного зоопарка животных!")
    } else {
        println("Список животных, подходящих для контактного зоопарка:")
        animals.forEach { println("${it.name} (ID: ${it.id})") }
    }
}

// Функция для отображения всех животных и вещей, содержащихся на балансе зоопарка.
fun displayAllInventory(zoo: Zoo) {
    println("Список всех животных и вещей на балансе зоопарка:")
    zoo.getInventory().forEach {
        when (it) {
            is Animal -> println("Животное: ${it.name} (ID: ${it.id}, вид: ${it.species})")
            is Thing -> println("Вещь: ${it.type} (ID: ${it.id})")
        }
    }
}