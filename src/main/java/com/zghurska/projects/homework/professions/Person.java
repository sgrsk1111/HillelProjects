package com.zghurska.projects.homework.professions;

public abstract class Person {

    protected final String yearOfBirth;
    protected final String fullNameDrivers;
//    protected final int age;

    public Person(String yearOfBirth, String fullNameDrivers) {
        this.yearOfBirth = yearOfBirth;
        this.fullNameDrivers = fullNameDrivers;
    }


}
