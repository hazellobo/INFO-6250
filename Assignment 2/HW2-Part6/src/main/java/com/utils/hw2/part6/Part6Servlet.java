/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.utils.hw2.part6;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hazel
 */
public class Part6Servlet extends HttpServlet {

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
        
        //writing the paramters on the browser
	String academicTerm= request.getParameter("academicTerm");
	String academicYear= request.getParameter("academicYear");
	String employeeStatus[]= request.getParameterValues("employeeStatus");
        String employeeStatus_other=request.getParameter("employeeStatus_other");
        
        String studentName= request.getParameter("studentName");
	String relToEmployee= request.getParameter("relToEmployee");
	String studentNuid= request.getParameter("studentNuid");
	String empName=request.getParameter("empName");
	String empNuid=request.getParameter("empNuid");
        
        String dept= request.getParameter("dept");
	String campus= request.getParameter("campus");
	String phone= request.getParameter("phone");
	String supName=request.getParameter("supName");
        
	String up=request.getParameter("up");
        String ls=request.getParameter("ls");
        String dc=request.getParameter("dc");
        String cpsu=request.getParameter("cpsu");
        String gs=request.getParameter("gs");
        String cpsg=request.getParameter("cpsg");
        
        
        String c1= request.getParameter("c1");
        String cn1= request.getParameter("cn1");
        String sup1= request.getParameter("sup1");
        String sign1= request.getParameter("sign1");
        String ch1= request.getParameter("ch1");
        String d1= request.getParameter("d1");	
        String t1= request.getParameter("t1");
        
        String c2= request.getParameter("c2");
        String cn2= request.getParameter("cn2");
        String sup2= request.getParameter("sup2");
        String sign2= request.getParameter("sign2");
        String ch2= request.getParameter("ch2");
        String d2= request.getParameter("d2");	
        String t2= request.getParameter("t2");

        String c3= request.getParameter("c3");
        String cn3= request.getParameter("cn3");
        String sup3= request.getParameter("sup3");
        String sign3= request.getParameter("sign3");
        String ch3= request.getParameter("ch3");
        String d3= request.getParameter("d3");	
        String t3= request.getParameter("t3");

        String empSign= request.getParameter("empSign");
        String empSigndate= request.getParameter("empSigndate");
        String hrmApproval= request.getParameter("hrmApproval");
        String hrmApprovaldate= request.getParameter("hrmApprovaldate");
        
	//Writing the parameters on the browser
	out.println("<!doctype HTML>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Submitted Details</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Submitted Details</h1>");
        
        //scetion 1 
        out.println("<h2>Section 1 </h2>");
        out.println("<b>Academic Term: </b>" + academicTerm + "<br>");
        out.println("<b>Academic Year: </b>" + academicYear + "<br>");
        out.println("<b>Employee Status: </b><br>");
        out.println("<ul>");
        for(String val : employeeStatus){
            out.println("<li>" + val + "</li>");
            if(val.equalsIgnoreCase("other")){
                out.println(employeeStatus_other);
            }
        }
        out.println("</ul>");
        
        
        //section 2
        out.println("<h2>Section 2 </h2>");
        out.println("<b>Student Name: </b>" + studentName + "<br>");
        out.println("<b>Relationship to Employee: </b>" + relToEmployee + "<br>");
        out.println("<b>Student NUID: </b>" + studentNuid + "<br>");
        out.println("<b>Employee’s Name (if different from Student’s): </b>" + empName + "<br>");
        out.println("<b>Employees's NUID: </b>" + empNuid + "<br>");
        out.println("<b>Department: </b>" + dept + "<br>");
        out.println("<b>Campus Location: </b>" + campus + "<br>");
        out.println("<b>Phone Number: </b>" + phone + "<br>");
        out.println("<b>Supervisors Name: </b>" + supName + "<br>");
        
        
        //section 3
        out.println("<h2>Section 3 </h2>");
        out.println("<b>Indicate the applicable school or program:</b><br>");
        if(up.equalsIgnoreCase("Y")){
            out.println("<li>Undergraduate Program</li>");
        }
        if(ls.equalsIgnoreCase("Y")){
            out.println("<li>Law School (excludes employees)</li>");
        }
        if(dc.equalsIgnoreCase("Y")){
            out.println("<li>Doctoral Candidate</li>");
        }
        if(cpsu.equalsIgnoreCase("Y")){
            out.println("<li>College of Professional Studies (CPS) Undergraduate</li>");
        }
        if(gs.equalsIgnoreCase("Y")){
            out.println("<li>Graduate School</li>");
        }
        if(cpsg.equalsIgnoreCase("Y")){
            out.println("<li>College of Professional Studies (CPS) Graduate</li>");
        }
        
        out.println("<b>Course Information:</b><br>");
        out.println("<table>");
	out.println("<tr><th>Course No.</th><th>Course Name</th><th>Supervisor</th>"
                + "<th>Signature</th><th>Credit Hrs.</th><th>Day(s)</th><th>Time</th></tr>");
        out.println("<tr>");
        out.println("<td>"+c1+"</td>");
        out.println("<td>"+cn1+"</td>");
        out.println("<td>"+sup1+"</td>");
        out.println("<td>"+sign1+"</td>");
        out.println("<td>"+ch1+"</td>");
        out.println("<td>"+d1+"</td>");
        out.println("<td>"+t1+"a.m./p.m.</td>");
        out.println("</tr>");
        
	out.println("<tr>");
        out.println("<td>"+c2+"</td>");
        out.println("<td>"+cn2+"</td>");
        out.println("<td>"+sup2+"</td>");
        out.println("<td>"+sign2+"</td>");
        out.println("<td>"+ch2+"</td>");
        out.println("<td>"+d2+"</td>");
        out.println("<td>"+t2+"a.m./p.m.</td>");
        out.println("</tr>");	  
        
        out.println("<tr>");
        out.println("<td>"+c3+"</td>");
        out.println("<td>"+cn3+"</td>");
        out.println("<td>"+sup3+"</td>");
        out.println("<td>"+sign3+"</td>");
        out.println("<td>"+ch3+"</td>");
        out.println("<td>"+d3+"</td>");
        out.println("<td>"+t3+"a.m./p.m.</td>");
        out.println("</tr>");
        
        out.println("</table>");
        
        //section 4
        out.println("<h2>Section 4 </h2>");
        out.println("<b>Employee's Signature: </b>" + empSign);
        out.println("<b>Date: </b>" + empSigndate + "<br>");
        
        
        //section 5
        out.println("<h2>Section 5 </h2>");
        out.println("<b>HRM Approval: </b>" + hrmApproval);
        out.println("<b>Date: </b>" + hrmApprovaldate + "<br>");
      
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
