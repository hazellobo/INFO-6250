/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utils.movieapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author hazel
 */
public class ConnectionDao {
   
    public Connection connection;
    public Connection getConnection() throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/moviedb", "root", "root");
        } catch (SQLException ex) {
            throw ex;
        }
        return this.connection;
    }
}
