/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.utils.bookapp.controller;

import com.utils.bookapp.dao.BookDao;
import com.utils.bookapp.model.Book;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Base64;

/**
 *
 * @author hazel
 */
@WebServlet(name = "BookController")
public class BookController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet BookController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet BookController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

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
            String amount = request.getParameter("quantity");
            int count = Integer.parseInt(amount);
            
            List<String> isbnList = new ArrayList<>();
            List<String> titleList = new ArrayList<>();
            List<String> authorsList = new ArrayList<>();
            List<Float> priceList = new ArrayList<>();

            //Populating data in array
            for(int i = 0; i < count; i++){
                isbnList.add(request.getParameter("isbn"+i)); 
                titleList.add(request.getParameter("title" + i));
                authorsList.add(request.getParameter("authors" + i));
                priceList.add(Float.valueOf(request.getParameter("price" + i)));
            }

            BookDao bkdao = new BookDao();
            int result = bkdao.addBook(isbnList, titleList, authorsList, priceList);

            
            if(result > 0){
                request.setAttribute("count", count);
                requestDispatcher = getServletContext().getRequestDispatcher("/addBookSuccess.jsp");
                requestDispatcher.forward(request,response);
            }else {
                requestDispatcher = request.getRequestDispatcher("/error.jsp");
                requestDispatcher.forward(request, response);
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
