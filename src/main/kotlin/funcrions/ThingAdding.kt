package org.example.funcrions

import org.example.classes.Zoo
import org.example.interfaces.IThingFactory

// Функция для добавления ВЕЩЕЙ на баланс зоопарка.
fun addThing(zoo: Zoo, thingFactory: IThingFactory) {
    println("Тип вещи (1 - стол, 2 - компьютер):")
    val type = readLine()?.toIntOrNull() ?: return

    val thing = when (type) {
        1 -> thingFactory.createTable()
        2 -> thingFactory.createComputer()
        else -> {
            println("Неверный тип вещи!")
            return
        }
    }
    zoo.addThing(thing)
}