package com.zghurska.projects.homework.homework13;

public class Unit {

    protected int x;
    protected int y;
    protected boolean immortal = false;

    public Unit(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isImmortal() {
        return immortal;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "x=" + x +
                ", y=" + y +
                ", immortal=" + immortal +
                '}';
    }
}
