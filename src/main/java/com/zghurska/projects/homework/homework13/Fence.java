package com.zghurska.projects.homework.homework13;

public class Fence extends Unit {

    public Fence(int x, int y) {
        super(x, y);
    }

    @Override
    public String toString() {
        return "Fence{" +
                "x=" + x +
                ", y=" + y +
                ", immortal=" + immortal +
                '}';
    }
}
