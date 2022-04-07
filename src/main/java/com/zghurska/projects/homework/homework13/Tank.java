package com.zghurska.projects.homework.homework13;

public class Tank extends MobileUnit {

    public Tank(int x, int y) {
        super(x, y);
    }

    public void reload() {
        System.out.println("Reload");
    }

    @Override
    public String toString() {
        return "Tank{" +
                "x=" + x +
                ", y=" + y +
                ", immortal=" + immortal +
                '}';
    }
}
