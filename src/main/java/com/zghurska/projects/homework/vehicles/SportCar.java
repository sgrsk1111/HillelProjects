package com.zghurska.projects.homework.vehicles;

import com.zghurska.projects.homework.details.Engine;
import com.zghurska.projects.homework.professions.Driver;

public class SportCar extends Car {
    private final double speed;

    public SportCar(String brandAuto, double weight, Driver driver, Engine engine, double speed) {
        super(brandAuto, weight, driver, engine);
        this.speed = speed;
        this.setClassAuto("Racing auto");
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "brandAuto='" + brandAuto + '\'' +
                ", classAuto='" + classAuto + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
                ", speed=" + speed +
                '}';
    }
}
