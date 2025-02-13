package org.example.interfaces

// Интерфейс IAlive нужен для определения типов к категории "живых" (по заданию)
// Наделяет реализуемые типы свойством foodConsumption - потребляемое еол-во еды в сутки
interface IAlive {
    val foodConsumption: Int
}