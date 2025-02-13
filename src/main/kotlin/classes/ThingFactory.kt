package org.example.classes

import org.example.interfaces.IThingFactory

// Класс ThingFactory наследует интерфейс IThingFactory и
// представляет реализацию фабрики для создания ВЕЩЕЙ.
class ThingFactory : IThingFactory {
    override fun createTable(): Thing {
        return Table()
    }
    override fun createComputer(): Thing {
        return Computer()
    }
}