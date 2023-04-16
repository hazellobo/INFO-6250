/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.utils.hw2.part8;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hazel
 */
@WebServlet(name = "Part8Servlet", urlPatterns = {"/viewSubmittedData.htm"})
public class Part8Servlet extends HttpServlet {

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
        out.println("<table class=\"table table-bordered table-striped\" width=\"500\">");
        out.println("<tr>");
        out.println("<th> Paramter Name</th>");
        out.println("<th> Paramter Values</th>");
        out.println("</tr>");
        
        Map m=request.getParameterMap();
        Set s = m.entrySet();
        Iterator it = s.iterator();
        while(it.hasNext()){
             out.println("<tr>");
             Map.Entry<String,String[]> entry = (Map.Entry<String,String[]>)it.next();
             String key = entry.getKey();
             String[] value = entry.getValue();
             
             out.println("<td>"+key+"</td>");
             out.println("<td>");
             if(value.length>1){ 
                for (int i = 0; i < value.length; i++) {
                      out.println("<li>" + value[i].toString() + "</li><br>");
                }
             }else{
                out.println(value[0].toString());
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
