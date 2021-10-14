package ru.job4j.poly;

public class Buses implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " перемещаеться по трассе");
    }
}
