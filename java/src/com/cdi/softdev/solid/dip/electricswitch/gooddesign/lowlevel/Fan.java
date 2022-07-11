package com.cdi.softdev.solid.dip.electricswitch.gooddesign.lowlevel;

import com.cdi.softdev.solid.dip.electricswitch.gooddesign.highlevel.Switchable;

public class Fan implements Switchable {

    @Override
    public void turnOn() {
        System.out.println("Fan: Fan turned on...");
    }
    
    @Override
    public void turnOff() {
        System.out.println("Fan: Fan turned off...");
    }
}