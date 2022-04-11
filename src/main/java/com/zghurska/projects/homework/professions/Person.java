package com.zghurska.projects.homework.professions;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public abstract class Person {

    protected final String yearOfBirth;
    protected final String fullNameDrivers;
    protected final int age;

    public Person(String yearOfBirth, String fullNameDrivers) {
        this.yearOfBirth = yearOfBirth;
        this.fullNameDrivers = fullNameDrivers;
        age = calculateAge();

    }

    private int calculateAge() {
        LocalDateTime currentDate = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy", new Locale("uk"));
        LocalDate birthDate = LocalDate.parse(yearOfBirth, formatter);
        return Period.between(birthDate, LocalDate.from(currentDate)).getYears();
    }

    @Override
    public String toString() {
        return "Person{" +
                "yearOfBirth='" + yearOfBirth + '\'' +
                ", fullNameDrivers='" + fullNameDrivers + '\'' +
                ", age=" + age +
                '}';
    }
}



