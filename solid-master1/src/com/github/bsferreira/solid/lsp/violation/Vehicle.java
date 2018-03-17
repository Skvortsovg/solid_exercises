package com.github.bsferreira.solid.lsp.violation;

/**
 * Created by bsferreira on 10-04-2016.
 */
public class Vehicle {

    private Gear gear;
    private boolean isMoving;

    public Gear getGear() {
        return gear;
    }

    public void changeGear(final Gear gear) {
        this.gear = gear;
    }

    public void move() {
        isMoving = true;
    }

    public void stop() {
        isMoving = false;
    }

    public booleas isMoving() {
        return isMoving;
    }

}