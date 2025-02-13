package org.example

import org.example.classes.*
import org.example.funcrions.*
import org.example.interfaces.IThingFactory
import org.koin.core.context.GlobalContext.startKoin
import org.koin.java.KoinJavaComponent.get
import org.koin.dsl.module

// DI-модуль для внедрения зависимостей через Koin.
val appModule = module {
    single { Clinic() }
    single { InventoryManager() }
    single { FoodCalculator() }
    single { ContactZooChecker() }
    single { ThingFactory() }
    single { Zoo(get(), get(), get(), get()) }
}

fun main() {
    // Инициализируем Koin.
    startKoin { modules(appModule) }

    // Получаем из DI-контейнера экземпляры Zoo и IThingFactory.
    // Зависимости для них автоматически внедряются с помощью Koin.
    val zoo: Zoo = get(Zoo::class.java)
    val thingFactory: IThingFactory = get(ThingFactory::class.java)

    // Цикл работы программы. Печатаем меню и обрабатываем действия пользователя.
    while (true) {
        printMenu()

        when (readLine()?.toIntOrNull()) {
            1 -> addAnimal(zoo)
            2 -> addThing(zoo, thingFactory)
            3 -> println("Суммарное потребление еды: ${zoo.getTotalFoodConsumption()} кг")
            4 -> displayContactZooList(zoo)
            5 -> displayAllInventory(zoo)
            6 -> return
            else -> println("Неверный ввод! Повторите попытку.")
        }
    }
}