package com.zghurska.projects.homework.vehicles;

import com.zghurska.projects.homework.details.Engine;
import com.zghurska.projects.homework.professions.Driver;

public class Lorry extends Car {

    private final int carrying;

    public Lorry(String brandAuto, double weight, Driver driver, Engine engine, int carrying) {
        super(brandAuto, weight, driver, engine);
        this.carrying = carrying;
        setClassAuto("Lorry");
    }

    @Override
    public String toString() {
        return "Lorry{" +
                super.toString() +
                ", carrying=" + carrying +
                '}';
    }

}
