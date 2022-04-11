package com.zghurska.projects.homework.professions;


public class Driver extends Person {

    private int drivingExperience;

    public Driver(String yearOfBirth, String fullNameDrivers) {
        super(yearOfBirth, fullNameDrivers);
    }

    public void setExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "drivingExperience=" + drivingExperience +
                ", yearOfBirth='" + yearOfBirth + '\'' +
                ", fullNameDrivers='" + fullNameDrivers + '\'' +
                ", age=" + age +
                '}';
    }
}
