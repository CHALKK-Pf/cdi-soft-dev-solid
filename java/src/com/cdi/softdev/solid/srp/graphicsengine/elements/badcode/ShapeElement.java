package com.cdi.softdev.solid.srp.graphicsengine.elements.badcode;

import com.cdi.softdev.solid.srp.graphicsengine.bezier.BezierSpline;
import com.cdi.softdev.solid.srp.graphicsengine.math.SuperSmartMath;
import com.cdi.softdev.solid.srp.graphicsengine.otherscode.IDevice;
import com.pfizer.colorparser.ColorParser;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

public class ShapeElement {

    private ArrayList<BezierSpline> splines;
    private String fillColor;
    private String strokeColor;
    private double strokeWidth;

    private final ColorParser colorParser;
    private final SuperSmartMath smartMath;

    public ShapeElement() {
        splines = new ArrayList<>();
        fillColor = "black";
        strokeColor = "red";
        strokeWidth = 1.0;
        colorParser = new ColorParser();
        smartMath = new SuperSmartMath();
    }

    public ArrayList<BezierSpline> getSplines() { return splines; }

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
        device.push();
        this.splines.forEach((spl)->{
            device.addSpline(spl.getSpline());
        });
        var fillColorValues = this.colorParser.parse(fillColor);
        var strokeColorValues = this.colorParser.parse(strokeColor);
        device.fill(fillColorValues,0);
        device.stroke(strokeColorValues,0);
        device.pop();
    }

    public boolean hitTest(double x, double y){

        //weird math algorithm
        boolean isHit = false;
        for (var spl:splines){
            for (var pt:spl.getSpline()){
                if (smartMath.mathThing(pt.getAnchor().getX(), pt.getPost().getY())){
                    isHit = true;
                    break;
                }
            }
        }

        return  isHit;
    }

    public void saveToDatabase()
    {
        //code to save the  ShapeElement to a database
        String URL = "jdbc:oracle:thin:@amrood:1521:EMP";
        Properties info = new Properties( );
        info.put( "user", "username" );
        info.put( "password", "password" );

        try {
            var conn = DriverManager.getConnection(URL, info);
            var stm = conn.prepareStatement("Insert into ShapeElement values (?)");
            stm.setString(1,this.fillColor);
            stm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
