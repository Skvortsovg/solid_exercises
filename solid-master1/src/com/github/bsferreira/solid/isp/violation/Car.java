package com.github.bsferreira.solid.isp.violation;

/**
 * Created by bsferreira on 10-04-2016.
 */
public class Car extends Vehicle implements IRadioSwitch {

    private boolean radioOn;

    public boolean isRadioOn() {
        return radioOn;
    }

    @Override
    public void turnRadioOn() {
        radioOn = true;
    }

    @Override
    public void turnRadioOff() {
        radioOn = false;
    }

}