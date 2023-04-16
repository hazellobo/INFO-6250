/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.utils.movieapp.controller;

import com.utils.movieapp.dao.MovieDao;
import com.utils.movieapp.model.Movie;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hazel
 */
@WebServlet(name = "MovieController")
public class MovieController extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        String option = request.getParameter("option");
        RequestDispatcher requestDispatcher;
        if (option.equalsIgnoreCase("add")) {
            requestDispatcher = getServletContext().getRequestDispatcher("/addMovie.jsp");
            requestDispatcher.forward(request, response);
        } else if (option.equalsIgnoreCase("browse")) {
            requestDispatcher = getServletContext().getRequestDispatcher("/browseMovie.jsp");
            requestDispatcher.forward(request, response);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher requestDispatcher;
        PrintWriter out = response.getWriter();

        String option = request.getParameter("option");

        if (option.equalsIgnoreCase("add")) {

            Movie movieData = new Movie();
            String title = request.getParameter("title");
            String actor = request.getParameter("actor");
            String actress = request.getParameter("actress");
            String genre = request.getParameter("genre");
            Integer year = Integer.valueOf(request.getParameter("year"));

            MovieDao movieObj = new MovieDao();
            int result = movieObj.addMovie(title, actor, actress, genre, year);

            if (result == 1) {
                movieData.setTitle(title);
                movieData.setActor(actor);
                movieData.setActress(actress);
                movieData.setGenre(genre);
                movieData.setYear(year);

                request.setAttribute("movie", movieData);
                requestDispatcher = getServletContext().getRequestDispatcher("/AddMovieSuccess.jsp");
                try {
                    requestDispatcher.forward(request, response);
                } catch (ServletException | IOException ex) {
                    out.println(ex);
                }

            } else {
                requestDispatcher = request.getRequestDispatcher("/error.jsp");
                requestDispatcher.forward(request, response);
            }
        } else if (option.equalsIgnoreCase("browse")) {
            String searchValue = request.getParameter("searchtext");
            String searchparam = request.getParameter("searchoption");
            System.out.println(searchparam);
            MovieDao searchObj = new MovieDao();
            List<Movie> searchedMovie = searchObj.searchedMovie(searchValue, searchparam);
            
            request.setAttribute("filter",searchparam);
            request.setAttribute("keyword",searchValue);
            
            if (searchedMovie.isEmpty()) {
                requestDispatcher = getServletContext().getRequestDispatcher("/noMovieFound.jsp");
                try {
                    requestDispatcher.forward(request, response);
                } catch (ServletException | IOException ex) {
                    out.println(ex);
                }
            } else if (!searchedMovie.isEmpty()) {
                request.setAttribute("movieList", searchedMovie);
                requestDispatcher = getServletContext().getRequestDispatcher("/ViewMovieSuccess.jsp");
                try {
                    requestDispatcher.forward(request, response);
                } catch (ServletException | IOException ex) {
                    out.println(ex);
                }
            }
        }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
