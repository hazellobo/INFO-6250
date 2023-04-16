/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utils.bookapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author hazel
 */
public class BookDao {
    public int addBook(List<String> isbn, List<String> title, List<String> authors, List<Float> price){
        int rowAffected = 0;
        try{
            ConnectionDao dbdao = new ConnectionDao();
            try (Connection connection = dbdao.getConnection()) {
            String query = "INSERT INTO books (isbn, title, authors, price) VALUE (?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(query);
            for(int i = 0; i < isbn.size();i++){
                ps.setString(1,isbn.get(i));
                ps.setString(2,title.get(i));
                ps.setString(3,authors.get(i));
                ps.setFloat(4,price.get(i));
                rowAffected = ps.executeUpdate();
            }
        }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return rowAffected;
    }
}
