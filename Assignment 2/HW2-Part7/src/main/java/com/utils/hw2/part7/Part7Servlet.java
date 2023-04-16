/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.utils.hw2.part7;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hazel
 */
@WebServlet(name = "Part7Servlet", urlPatterns = {"/viewSubmittedData.htm"})
public class Part7Servlet extends HttpServlet {

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
        PrintWriter out=response.getWriter();
        out.println("<!doctype HTML>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Submitted Details</title>");
        out.println("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1 align=\"center\">Submitted Details</h1>");
        out.println("<table class=\"table table-bordered table-striped\">");
        out.println("<tr>");
        out.println("<th> Paramter Name</th>");
        out.println("<th> Paramter Values</th>");
        out.println("</tr>");
        
        Enumeration enumeration=request.getParameterNames();
         while (enumeration.hasMoreElements()) {
            out.println("<tr>");
            String parameterName = (String) enumeration.nextElement();
            String[] parameterValue=request.getParameterValues(parameterName);
            out.println("<td>"+parameterName+"</td>");
            out.println("<td>");
            if(parameterValue.length>1){ 
                for (int i = 0; i < parameterValue.length; i++) {
                      out.println("<li>" + parameterValue[i].toString() + "</li><br>");
                }
             }else{
                out.println(parameterValue[0].toString());
                out.println("<br>");
             }
            out.println("</td>");
            out.println("</tr>");
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
