package com.cdi.softdev.solid.srp.graphicsengine.elements.goodcode;

import com.cdi.softdev.solid.srp.graphicsengine.math.SuperSmartMath;

public class GoodHitTester implements  IHitTester{

    private final SuperSmartMath smartMath;

    public  GoodHitTester(){
        smartMath = new SuperSmartMath();
    }

    @Override
    public boolean hitTest(ShapeElement shapeElement, double x, double y) {
        //weird math algorithm
        boolean isHit = false;
        for (var spl:shapeElement.getSplines()){
            for (var pt:spl.getSpline()){
                if (smartMath.mathThing(pt.getAnchor().getX(), pt.getPost().getY())){
                    isHit = true;
                    break;
                }
            }
        }

        return  isHit;
    }
}
