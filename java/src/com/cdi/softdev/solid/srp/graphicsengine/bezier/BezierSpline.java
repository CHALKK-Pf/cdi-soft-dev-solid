package com.cdi.softdev.solid.srp.graphicsengine.bezier;

import java.util.ArrayList;

public class BezierSpline {
    private final ArrayList<PathTriple> spline;
    public  BezierSpline(){
        spline = new ArrayList<>();
    }

    public ArrayList<PathTriple> getSpline(){
        return  spline;
    }
}
