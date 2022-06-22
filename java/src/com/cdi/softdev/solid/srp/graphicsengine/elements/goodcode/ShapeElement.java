package com.cdi.softdev.solid.srp.graphicsengine.elements.goodcode;

import com.cdi.softdev.solid.srp.graphicsengine.bezier.BezierSpline;
import com.cdi.softdev.solid.srp.graphicsengine.otherscode.IDevice;


import java.util.ArrayList;


public class ShapeElement {

    private ArrayList<BezierSpline> splines;
    private String fillColor;
    private String strokeColor;
    private double strokeWidth;


    public ShapeElement() {
        splines = new ArrayList<>();
        fillColor = "black";
        strokeColor = "red";
        strokeWidth = 1.0;

    }

    public ArrayList<BezierSpline> getSplines() {
        return splines;
    }

    public void setSplines(ArrayList<BezierSpline> splines) {
        this.splines = splines;
    }

    public String getFillColor() {
        return fillColor;
    }

    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }

    public String getStrokeColor() {
        return strokeColor;
    }

    public void setStrokeColor(String strokeColor) {
        this.strokeColor = strokeColor;
    }

    public double getStrokeWidth() {
        return strokeWidth;
    }

    public void setStrokeWidth(double strokeWidth) {
        this.strokeWidth = strokeWidth;
    }

    public void render(IDevice device)
    {
       new GoodRenderer().render(this,device);
    }

    public boolean hitTest(double x, double y){

        return new GoodHitTester().hitTest(this,x,y);
    }

    public void saveToDatabase()
    {
        new GoodRepository().save(this);
    }


}