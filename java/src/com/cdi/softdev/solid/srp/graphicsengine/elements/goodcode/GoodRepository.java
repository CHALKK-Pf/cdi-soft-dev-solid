package com.cdi.softdev.solid.srp.graphicsengine.elements.goodcode;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class GoodRepository implements IRepository {


    @Override
    public void save(ShapeElement shapeElement) {
        String URL = "jdbc:oracle:thin:@amrood:1521:EMP";
        Properties info = new Properties( );
        info.put( "user", "username" );
        info.put( "password", "password" );

        try {
            var conn = DriverManager.getConnection(URL, info);
            var stm = conn.prepareStatement("Insert into ShapeElement values (?)");
            stm.setString(1,shapeElement.getFillColor());
            stm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
