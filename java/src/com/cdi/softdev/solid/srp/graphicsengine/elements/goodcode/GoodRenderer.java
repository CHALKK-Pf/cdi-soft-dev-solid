package com.cdi.softdev.solid.srp.graphicsengine.elements.goodcode;

import com.cdi.softdev.solid.srp.graphicsengine.otherscode.IDevice;
import com.pfizer.colorparser.ColorParser;

public class GoodRenderer implements  IRenderer{
    private final ColorParser colorParser;

    public  GoodRenderer(){
        this.colorParser = new ColorParser();
    }

    @Override
    public void render(ShapeElement shapeElement, IDevice device) {
        device.push();
        shapeElement.getSplines().forEach((spl)->{
            device.addSpline(spl.getSpline());
        });
        var fillColorValues = this.colorParser.parse(shapeElement.getFillColor());
        var strokeColorValues = this.colorParser.parse(shapeElement.getStrokeColor());
        device.fill(fillColorValues,0);
        device.stroke(strokeColorValues,0);
        device.pop();
    }
}
