package com.cdi.softdev.solid.srp.graphicsengine.otherscode;

import com.cdi.softdev.solid.srp.graphicsengine.bezier.PathTriple;


import java.util.ArrayList;

public interface IDevice {

   void push();
   void addSpline(ArrayList<PathTriple> spline);

   void fill(int[] colorvalues, int colorspace);
   void stroke(int[] colorvalues, int colorspace);

   void pop();
}
