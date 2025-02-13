package org.example.interfaces

import org.example.classes.Thing

// Интерфейс IThingFactory определяет фабричный метод для создания ВЕЩЕЙ.
interface IThingFactory {
    fun createTable(): Thing
    fun createComputer(): Thing
}