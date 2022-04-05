package com.zghurska.projects.homework.homework12;

public class Person {

    //1. Создать класс Person который описывает человека, с полями: имя, фамилия, возраст, вес, рост.
    // Создать один или несколько конструкторов которые гарантирует что у каждого есть имя и фамилия.
    private String name;
    private String surname;
    private int age;
    private double weight;
    private int height;

    public Person(String yourName, String yourSurname) {
        name = yourName;
        surname = yourSurname;
    }

    public Person(String name, String surname, int age, double weight, int height) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}

