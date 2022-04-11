package com.zghurska.projects.homework.details;


public class Engine {

    public int power;
    public String producer;

    public Engine(int power, String producer) {
        this.power = power;
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", producer='" + producer + '\'' +
                '}';
    }
}
