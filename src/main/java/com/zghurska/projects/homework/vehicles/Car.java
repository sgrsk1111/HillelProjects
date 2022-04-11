package com.zghurska.projects.homework.vehicles;


import com.zghurska.projects.homework.details.Engine;
import com.zghurska.projects.homework.professions.Driver;

public class Car {

    protected final String brandAuto;
    protected String classAuto;
    protected final double weight;
    protected final Driver driver;
    protected final Engine engine;

    public Car(String brandAuto, double weight, Driver driver, Engine engine) {
        this.brandAuto = brandAuto;
        this.classAuto = classAuto;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public void setClassAuto(String classAuto) {
        this.classAuto = classAuto;
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brandAuto='" + brandAuto + '\'' +
                ", classAuto='" + classAuto + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }
}
