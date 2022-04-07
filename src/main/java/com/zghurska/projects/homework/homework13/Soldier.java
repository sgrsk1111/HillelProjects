package com.zghurska.projects.homework.homework13;

public class Soldier extends MobileUnit {

    public Soldier(int x, int y) {
        super(x, y);
    }

    @Override
    public String toString() {
        return "Soldier{" +
                "x=" + x +
                ", y=" + y +
                ", immortal=" + immortal +
                '}';
    }
}
