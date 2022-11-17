package ru.job4j.poly;

public interface Transport {
    void drive();

    void passengers(int numberOfPas);

    float refuel(int fuelQuantity);
}
