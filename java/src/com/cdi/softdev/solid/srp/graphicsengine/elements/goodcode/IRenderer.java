package com.cdi.softdev.solid.srp.graphicsengine.elements.goodcode;


import com.cdi.softdev.solid.srp.graphicsengine.otherscode.IDevice;

public interface IRenderer {

    void  render(ShapeElement shapeElement, IDevice device);
}
