/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.utils.csvfilereader;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hazel
 */
@WebServlet(name = "CsvJdbcFileReader", urlPatterns = {"/viewCsvData.xls"})
public class CsvJdbcFileReader extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        
        String fileName = request.getParameter("filename");
        String path = request.getRealPath("/csv");

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>View Csv Records</title>");
        out.println("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1 align=\"center\">" + fileName + ".csv</h1>");
        out.println("<table class=\"table table-bordered table-striped\">");
        try{
            Class.forName("org.relique.jdbc.csv.CsvDriver");
            Connection con = DriverManager.getConnection("jdbc:relique:csv:" + path);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from " + fileName);
            ResultSetMetaData data = rs.getMetaData();

            //csv headers
            out.println("<tr>");
            int columnCount = data.getColumnCount();
            for(int i = 1; i <= columnCount; i++){
                out.println("<th scope=\"col\">" + data.getColumnName(i)+"</th>");
            }
            out.println("</tr>");
            
            //records
            while(rs.next()){
                out.println("<tr>");
                for(int i = 1; i <= columnCount; i++){
                    out.println("<td>" + rs.getString(i)+"</td>");
                }
                out.println("</tr>");
            }

            rs.close();
            rs.close();
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
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
        processRequest(request, response);
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
        processRequest(request, response);
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
