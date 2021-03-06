package com.cdi.softdev.solid.dip.electricswitch.gooddesign.lowlevel;

import com.cdi.softdev.solid.dip.electricswitch.gooddesign.highlevel.Switchable;

public class LightBulb implements Switchable {

    @Override
    public void turnOn() {
        System.out.println("LightBulb: Bulb turned on...");
    }

    @Override
    public void turnOff() {
        System.out.println("LightBulb: Bulb turned off...");
    }
}