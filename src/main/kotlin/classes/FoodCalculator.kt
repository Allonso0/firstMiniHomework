package org.example.classes

// Класс FoodCalculator, который подсчитывает общее количество потребляемой
// животными зоопарка еды. Содержит методы addFoodConsumption и getTotalFoodConsumption
// для добавления потребления еды животным к общему количеству и возвращения общего кол-ва
// потребляемой еды.
class FoodCalculator {
    private var totalFoodConsumption = 0

    fun addFoodConsumption(animal: Animal) {
        totalFoodConsumption += animal.foodConsumption
    }

    fun getTotalFoodConsumption(): Int {
        return totalFoodConsumption
    }
}