/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.utils.excelfilereader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;

/**
 *
 * @author hazel
 */
@WebServlet(name = "ExcelFileReader", urlPatterns = {"/showExcel"})
public class ExcelFileReader extends HttpServlet {

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
        String fileName = "store.xls";
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        StringBuffer sb= new StringBuffer();
        sb.append("<!DOCTYPE html>");
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>View Excel Records</title>");
        sb.append("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("<h1 align=\"center\">" + fileName + "</h1>");

        File file = new File(getServletContext().getRealPath("/csv/") + fileName);
        FileInputStream stream = new FileInputStream(file);
        HSSFWorkbook workbook = new HSSFWorkbook(stream);
        for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
            HSSFSheet sh = workbook.getSheetAt(i);
            sb.append("<table class=\"table table-bordered table-striped\">");
            for (int j = 0; j < sh.getLastRowNum(); j++) {
                HSSFRow row = sh.getRow(j);
                out.println("<tr>");
                for (int k = 0; k < row.getLastCellNum(); k++) {
                    HSSFCell cell = row.getCell(k);
                    String value;
                    if(cell.getCellType()==CellType.NUMERIC){
                        int d=(int)cell.getNumericCellValue();
                        value=Integer.toString(d);
                    }else{
                        value=cell.getStringCellValue();
                    }
                    if (j == 0) {
                        sb.append(" <th scope=\"col\"> " + value+"</th>");
                    } else {
                        sb.append("<td>" + value+ "</td>");
                    }
                }
                sb.append("</tr>");

            }
            sb.append("</table>");
        }
        sb.append("</body>");
        sb.append("</html>");
        out.println(sb);
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
