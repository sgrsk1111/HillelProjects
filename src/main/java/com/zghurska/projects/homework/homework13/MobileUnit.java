package com.zghurska.projects.homework.homework13;

public class MobileUnit extends Unit {

    public MobileUnit(int x, int y) {
        super(x, y);
    }

    public void move() {
        x++;
        y++;
    }

    private void fire() {
        System.out.println("Fire!");
    }
}
