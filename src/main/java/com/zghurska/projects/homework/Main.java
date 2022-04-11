package com.zghurska.projects.homework;

import com.zghurska.projects.homework.details.Engine;
import com.zghurska.projects.homework.professions.Driver;
import com.zghurska.projects.homework.vehicles.Lorry;
import com.zghurska.projects.homework.vehicles.SportCar;

public class Main {

    public static void main(String[] args) {
        Driver driver = new Driver("12.02.1995", "Vasya Pupkin");
        System.out.println(driver);
        driver.setExperience(5);
        Engine engine = new Engine(200, "Company");
        System.out.println(engine);
        Lorry lorry = new Lorry("DAF", 500.00, driver, engine, 20);
        System.out.println(lorry);
        lorry.stop();
        System.out.println(lorry);
        SportCar sportCar = new SportCar("F1", 500.00, driver, engine, 300);
        System.out.println(sportCar);
        sportCar.turnLeft();
    }
}
