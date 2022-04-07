package com.zghurska.projects.homework.homework13;

public class Tower extends Unit {

    public Tower(int x, int y) {
        super(x, y);
        immortal = true;
    }

    @Override
    public String toString() {
        return "Tower{" +
                "x=" + x +
                ", y=" + y +
                ", immortal=" + immortal +
                '}';
    }
}
