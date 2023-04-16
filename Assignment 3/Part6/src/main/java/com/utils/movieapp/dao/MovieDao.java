/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utils.movieapp.dao;

import com.utils.movieapp.model.Movie;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author hazel
 */
public class MovieDao {
   public int addMovie(String title, String actor, String actress, String genre, int year) {
        int rowAffected =0;
        try {
            ConnectionDao dbdao = new ConnectionDao();
            try (Connection connection = dbdao.getConnection()) {
                String query = "INSERT INTO movies (title, actor, actress, genre, year) VALUES (?,?,?,?,?)";
                PreparedStatement ps = connection.prepareStatement(query);
                ps.setString(1, title);
                ps.setString(2,actor);
                ps.setString(3, actress);
                ps.setString(4,genre);
                ps.setInt(5,year);              
                rowAffected=ps.executeUpdate();
            }
        } catch (Exception e) {
                e.printStackTrace();
            }
        return rowAffected;
    }
   
    public List<Movie> searchedMovie(String searchValue, String parameter) {
        List<Movie> movieList = new ArrayList();
        try{
            ConnectionDao dao = new ConnectionDao();
            try (Connection connection = dao.getConnection(); Statement statement = connection.createStatement()) {
                String sql = "select * from movies where ";
                switch (parameter) {
                    case "title":
                        sql += "title = '" + searchValue + "'";
                        break;
                    case "actor":
                        sql += "actor = '" + searchValue + "'";
                        break;
                    case "actress":
                        sql += "actress = '" + searchValue + "'";
                        break;
                    default:
                        break;
                }
                ResultSet res = statement.executeQuery(sql);
                while(res.next()){
                    Movie movie = new Movie();
                    String title = res.getString(1);
                    String actor = res.getString(2);
                    String actress = res.getString(3);
                    String genre = res.getString(4);
                    Integer year = Integer.valueOf(res.getString(5));
                    
                    movie.setTitle(title);
                    movie.setActor(actor);
                    movie.setActress(actress);
                    movie.setGenre(genre);
                    movie.setYear(year);
                    movieList.add(movie);
                }
                res.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }



        return movieList;
    }
    }
