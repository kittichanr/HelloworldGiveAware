/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import model.ConnectionBuilder;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author yeen
 */
public class HelloWorld {

    private int id;
    private String message;

    public HelloWorld(ResultSet rs) throws SQLException {
        id = rs.getInt("idName");
        message = rs.getString("name");
    }

    public HelloWorld() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static HelloWorld getHelloWorld() {
        HelloWorld helloWorld = null;        
        String sql = "SELECT * FROM HelloWorld";
        try {
            Connection con = (Connection) ConnectionBuilder.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                helloWorld = new HelloWorld(rs);
            }           
        } catch (Exception e) {
            System.out.println(e);
        }
        return helloWorld;
    }

    public static void main(String[] args) {
        HelloWorld hw = getHelloWorld();
        System.out.println(hw.getMessage());
    }
}
