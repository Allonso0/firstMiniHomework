package org.example.classes

import org.example.interfaces.IInventory

// Класс Zoo представляет зоопарк и координирует работу других компонентов (Clinic,
// InventoryManager, FoodCalculator и ContactZooChecker). Класс Zoo не занимается этим лично,
// а делегирует задачи этим компонентам. Таким образом, как я думаю, соблюдается первый из принципов
// SOLID - принцип единственной ответственности.
class Zoo(
    // Внедряем зависимости через конструктор.
    private val clinic: Clinic,
    private val inventoryManager: InventoryManager,
    private val foodCalculator: FoodCalculator,
    private val contactZooChecker: ContactZooChecker
) {
    private val animals = mutableListOf<Animal>() // Список всех животных в зоопарке.
    private val contactZooAnimals = mutableListOf<Herbo>() // Список животных для КЗ.

    // Добавление нового животного в зоопарк.
    fun addAnimal(animal: Animal) {
        if (clinic.isHealthyEnough(animal)) {
            inventoryManager.addItem(animal)
            animals.add(animal)
            foodCalculator.addFoodConsumption(animal)

            if (contactZooChecker.isSuitableForContactZoo(animal)) {
                contactZooAnimals.add(animal as Herbo)
            }
            println("Животное успешно добавлено!")
        } else {
            println("Животное не прошло проверку здоровья.")
        }
    }

    // Добавление ВЕЩИ на баланс зоопарка.
    fun addThing(thing: Thing) {
        inventoryManager.addItem(thing)
        println("Вещь успешно добавлена!")
    }

    // Функция возвращает список животных, подходящих для контактного зоопарка.
    fun getContactZooAnimals(): List<Herbo> {
        return contactZooAnimals.toList()
    }

    // Функция возвращает список всего, что находится на балансе зоопарка.
    fun getInventory(): List<IInventory> {
        return inventoryManager.getItems()
    }

    // Функция возвращает общее количество потребляемой еды всеми животными.
    fun getTotalFoodConsumption(): Int {
        return foodCalculator.getTotalFoodConsumption()
    }
}