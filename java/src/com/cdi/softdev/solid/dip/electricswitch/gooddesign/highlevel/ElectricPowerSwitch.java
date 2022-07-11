package com.cdi.softdev.solid.dip.electricswitch.gooddesign.highlevel;

public class ElectricPowerSwitch implements Switch {

    private Switchable client;
    private boolean on;

    public ElectricPowerSwitch(Switchable client) {
        this.client = client;
        this.on = false;
    }

    public boolean isOn() {
        return this.on;
    }
    
    public void press(){
       boolean checkOn = isOn();
       if (checkOn) {
           client.turnOff();
           this.on = false;
       } else {
             client.turnOn();
             this.on = true;
       }
    }
}