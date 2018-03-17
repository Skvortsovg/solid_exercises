package com.github.bsferreira.solid.lsp.violation;

/**
 * Created by bsferreira on 16-04-2016.
 */
public class Car extends Vehicle {

    @Override
    public void changeGear(Gear gear) {
        if (isMoving()) {
            stop();
        }
        super.changeGear(gear);
    }
}
