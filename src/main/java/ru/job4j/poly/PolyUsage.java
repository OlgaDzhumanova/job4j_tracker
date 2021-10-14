package ru.job4j.poly;

public class PolyUsage {
    public static void main(String[] args) {
        Vehicle plane = new Plane();
        Vehicle train = new Train();
        Vehicle buses = new Buses();

        Vehicle[] typesOfTransport = new Vehicle[]{plane, train, buses};
        for (Vehicle v : typesOfTransport){
            v.move();
        }
    }
}
