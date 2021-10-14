package ru.job4j.poly;

public class Bus implements Transport {
    private String itinerary;

    @Override
    public void drive() {
        System.out.println("Автобус движеться по марщруту: " + itinerary);
    }

    @Override
    public void passengers(int numberOfPas) {
        System.out.println("Количество пассажиров на маршруте " + itinerary + " : " + numberOfPas);
    }

    @Override
    public float refuel(int fuelQuantity) {
        System.out.println("Затраченно топлива на сумму:");
        return fuelQuantity;
    }
}
